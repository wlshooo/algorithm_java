package programmers.level1;

public class Q공원_산책_ {
    class Solution {
        public int[] solution(String[] park, String[] routes) {
            String[][] map = new String[park.length][park[0].length()];
            int[] answer = new int[2];
            int currentPosX = 0;
            int currentPosY = 0;

            for (int i = 0; i < park.length; i++) {
                String[] split = park[i].split("");
                for (int j = 0; j < split.length; j++) {
                    map[i][j] = split[j];
                    if (split[j].equals("S")) {
                        currentPosX = i;
                        currentPosY = j;
                    }
                }
            }

            for (int i = 0; i < routes.length; i++) {
                String[] split = routes[i].split(" ");
                String direction = split[0];
                int p = Integer.parseInt(split[1]);
                if (direction.equals("N") && currentPosX - p >= 0) {
                    boolean isCheck = true;
                    for (int j = currentPosX; j >= currentPosX - p; j--) {
                        if (map[j][currentPosY].equals("X")) {
                            isCheck = false;
                            break;
                        }
                    }
                    if (isCheck) currentPosX -= p;
                } else if (direction.equals("S") && currentPosX + p < map.length) {
                    boolean isCheck = true;
                    for (int j = currentPosX; j <= currentPosX + p; j++) {
                        if (map[j][currentPosY].equals("X")) {
                            isCheck = false;
                            break;
                        }
                    }
                    if (isCheck) currentPosX += p;
                } else if (direction.equals("W") && currentPosY - p >= 0) {
                    boolean isCheck = true;
                    for (int j = currentPosY; j >= currentPosY - p; j--) {
                        if (map[currentPosX][j].equals("X")) {
                            isCheck = false;
                            break;
                        }
                    }
                    if (isCheck) currentPosY -= p;
                } else if (direction.equals("E") && currentPosY + p < map[0].length) {
                    boolean isCheck = true;
                    for (int j = currentPosY; j <= currentPosY + p; j++) {
                        if (map[currentPosX][j].equals("X")) {
                            isCheck = false;
                            break;
                        }
                    }
                    if (isCheck) currentPosY += p;
                }
            }
            answer[0] = currentPosX;
            answer[1] = currentPosY;

            return answer;
        }
    }
}