package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Q스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_tree = {"BACDE", "CBADF", "AECB", "BDA"};
        Solution solution = new Solution();
        int result = solution.solution(skill, skill_tree);
        System.out.println(result);
    }

    static class Solution {
        static Map<String, Integer> skillMap;
        static int[] skillArray;
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            skillMap = new HashMap<>();


            String[] split = skill.split("");
            for (int i = 0; i < split.length; i++) {
                skillMap.put(split[i], i+1);
            }
            for (int i = 0; i < skill_trees.length; i++) {
                String currentSkillTrees = skill_trees[i];
                if(checkSkillTree(currentSkillTrees, skill.length())) answer++;
            }
            return answer;
        }
        public boolean checkSkillTree(String currentSkillTrees, int skillLength) {
            skillArray = new int[skillLength];
            String[] skillTreeSplit = currentSkillTrees.split("");
            if (isValidSkillTree(skillTreeSplit)) return true;
            return false;
        }

        private static boolean isValidSkillTree(String[] skillTreeSplit) {
            for (int i = 0; i < skillTreeSplit.length; i++) {
                String s = skillTreeSplit[i];
                if (skillMap.get(s) != null) {
                    int number = skillMap.get(s);
                    if (number != 1) {
                        for (int j = 0; j < number - 1; j++) {
                            if (skillArray[j] == 0) {
                                return false;
                            }
                        }
                        skillArray[number - 1]++;
                    } else {
                        skillArray[0]++;
                    }
                }
            }
            return true;
        }
    }
}
