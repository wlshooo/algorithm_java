package programmers.level2;


import java.util.*;

public class Q주차_요금_계산 {
    public static void main(String[] args) {
        int[] fees = {1, 461, 1, 10};
        String[] records = {
                "00:00 1234 IN"
        };

        Solution s = new Solution();
        int[] solution = s.solution(fees, records);
        for (int T : solution) {
            System.out.println(T);
        }
    }

    static class Solution {
        public int[] solution(int[] fees, String[] records) {

            Map<String, Integer> parkingRecord = new HashMap<>();
            Map<String, Integer> priceRecord = new TreeMap<>(); //

            for (int i = 0; i < records.length; i++) {
                String[] recordSplit = records[i].split(" ");
                String[] strTime = recordSplit[0].split(":");

                int time = Integer.parseInt(strTime[0]) * 60 + Integer.parseInt(strTime[1]);
                String carNumber = recordSplit[1];
                String classification = recordSplit[2];

                if (classification.equals("IN")) {
                    parkingRecord.put(carNumber, time);
                    continue;
                }
                if (classification.equals("OUT")) {
                    if (!priceRecord.containsKey(carNumber)) {
                        priceRecord.put(carNumber, time - parkingRecord.get(carNumber));
                    } else { // 한번 입출차한 기록이있다면 기존 시간에 새 시간 누적
                        priceRecord.put(carNumber, priceRecord.get(carNumber) + time - parkingRecord.get(carNumber));
                    }
                    parkingRecord.remove(carNumber);
                }
            }
            if (!parkingRecord.isEmpty()) {
                for (String carNum : parkingRecord.keySet()) {
                    Integer cost = priceRecord.get(carNum);
                    cost = (cost == null) ? 0 : cost;
                    priceRecord.put(carNum, cost + (23 * 60 + 59) - parkingRecord.get(carNum));
                }
            }


            List<Integer> answer = new ArrayList<>(priceRecord.size());
            for (Integer c : priceRecord.values()) {
                int basicTime = fees[0];
                int basicCharge = fees[1];
                int unitTime = fees[2];
                int unitCharge = fees[3];

                // 요금 = 기본요금 + ((min-기본시간) / 단위시간) * 단위요금
                if (c <= basicTime) {
                    answer.add(basicCharge);
                } else {
                    answer.add((int) (basicCharge + Math.ceil((double) (c - basicTime) / unitTime) * unitCharge));
                }
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

/*
package programmers.level2;


import java.util.*;

public class Q주차_요금_계산 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                        "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
    }

    public static int[] solution(int[] fees, String[] records) {
        // 주차한 차들의 번호와 시간을 갖는 리스트
        Map<String, Integer> parking = new HashMap<>();
        // 차들의 번호와 누적된 요금을 갖는 리스트 (트리맵으로 키 (차량번호) 기준 오름차순 정렬)
        Map<String, Integer> costs = new TreeMap<>();

        for (String r : records) {
            String[] record = r.split(" ");
            int time = getMin(record[0]); // 출차 시간
            String carNum = record[1]; // 차량번호
            String io = record[2]; // 출입

            if (io.equals("IN")) {
                parking.put(carNum, time);
            }
            if (io.equals("OUT")) {
                // 한번 들어왔던 차가 아니라면
                if (!costs.containsKey(carNum)) {
                    costs.put(carNum, time - parking.get(carNum));
                } else { // 한번 입출차한 기록이있다면 기존 시간에 새 시간 누적
                    costs.put(carNum, costs.get(carNum) + time - parking.get(carNum));
                }
                parking.remove(carNum);
            }
        }

        // 아직 출차하지 않은 차 계산
        if (!parking.isEmpty()) {
            for (String carNum : parking.keySet()) {
                Integer cost = costs.get(carNum);
                cost = (cost == null) ? 0 : cost;
                costs.put(carNum, cost + (23 * 60 + 59) - parking.get(carNum));
            }
        }

        List<Integer> answer = new ArrayList<>(costs.size());
        for (Integer c : costs.values()) {
            int basicTime = fees[0];
            int basicCharge = fees[1];
            int unitTime = fees[2];
            int unitCharge = fees[3];

            // 요금 = 기본요금 + ((min-기본시간) / 단위시간) * 단위요금
            if (c <= basicTime) {
                answer.add(basicCharge);
            } else {
                answer.add((int) (basicCharge + Math.ceil((double) (c - basicTime) / unitTime) * unitCharge));
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 시간을 분으로 환산하는 메서드
    private static int getMin(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}

*/


