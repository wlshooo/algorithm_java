package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q데이터_분석_ {
    class Solution {
        /**
         * 배열을 주어진 조건에 따라 필터링하고 정렬하는 함수
         *
         * @param data    입력 배열
         * @param ext     필터링 기준이 되는 열의 이름 ("code", "date", "maximum", "remain" 중 하나)
         * @param val_ext 필터링할 때 사용되는 값
         * @param sort_by 정렬 기준이 되는 열의 이름 ("code", "date", "maximum", "remain" 중 하나)
         * @return 필터링 및 정렬된 결과 배열
         */
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            // 초기화
            int count = 0;
            int[][] temp = new int[data.length][4];
            Map<String, Integer> map = new HashMap<>();
            map.put("code", 0);
            map.put("date", 1);
            map.put("maximum", 2);
            map.put("remain", 3);

            // 주어진 조건에 따라 필터링
            for (int i = 0; i < data.length; i++) {
                if (data[i][map.get(ext)] < val_ext) {
                    temp[count] = data[i];
                    count++;
                }
            }

            // 주어진 열을 기준으로 배열 정렬
            Arrays.sort(temp, new DataComparator(map.get(sort_by)));

            // 필터링 및 정렬된 결과를 저장할 배열 초기화
            int index = 0;
            int[][] answer = new int[count][4];

            // 필터링 및 정렬된 결과 복사
            for (int i = 0; i < temp.length; i++) {
                if (temp[i][0] != 0) {
                    answer[index] = temp[i];
                    index++;
                }
            }

            return answer;
        }

        /**
         * 배열을 주어진 열을 기준으로 오름차순으로 정렬하는 Comparator 클래스
         */
        static class DataComparator implements Comparator<int[]> {
            private final int index;

            /**
             * 생성자
             *
             * @param sort_by 비교 및 정렬할 열의 인덱스
             */
            public DataComparator(int sort_by) {
                index = sort_by;
            }

            /**
             * 두 배열을 비교하여 정렬 순서를 결정하는 메서드
             *
             * @param o1 비교할 첫 번째 배열
             * @param o2 비교할 두 번째 배열
             * @return 비교 결과 (-1, 0, 1 중 하나)
             */
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[index], o2[index]);
            }
        }
    }
}