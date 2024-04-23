package programmers.level1;

public class Q바탕화면_정리 {
    class Solution {
        public int[] solution(String[] wallpaper) {
            int maxX=Integer.MIN_VALUE;
            int maxY=Integer.MIN_VALUE;
            int minX=Integer.MAX_VALUE;
            int minY=Integer.MAX_VALUE;

            for (int i = 0; i < wallpaper.length; i++) {
                String[] split = wallpaper[i].split("");
                for (int j = 0; j < split.length; j++) {
                    if (split[j].equals("#")) {
                        maxX=Math.max(i,maxX);
                        maxY=Math.max(j,maxY);
                        minX=Math.min(i,minX);
                        minY=Math.min(j,minY);
                    }
                }
            }

            int[] answer = {minX,minY,maxX+1,maxY+1};
            return answer;
        }
    }
}