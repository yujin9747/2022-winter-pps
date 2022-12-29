public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0; // 가능한 스킬 트리 개수

        for(int i=0; i<skill_trees.length; i++){    // skill_trees 의 모든 스킬 트리에 대해 반복
            String one_skill = skill_trees[i];      
            int Idx=0;  // skill을 iterator할 index variable
            int j=0;    // one_skill을 iterator할 index variable
            for(; j<one_skill.length(); j++){
                if(skill.charAt(Idx) == one_skill.charAt(j)){   // skill tree 순서에 맞는 문자인 경우
                   Idx++;   // 다음 문자와의 비교
                   if(Idx == skill.length() || j == one_skill.length()-1) { // 모든 선행 스킬 트리가 다 나온 경우 || one_skill의 모든 문자를 검사 마친 경우
                    answer++;
                    break;
                   }
                }
                else{   // skill tree 순서에 맞는 문자가 아닌 경우
                    int flag=0;
                    for(int k=Idx+1; k<skill.length(); k++){    // 다음 순서의 문자가 먼저 온 것인지 확인
                        if(skill.charAt(k) == one_skill.charAt(j)) {
                            flag=1;
                            break;
                        }
                    }
                    if(flag == 1) break;                        // 순서에 맞지 않는 문자가 먼저 온 것이라면 카운팅 하지 않고 다음 skill_tree 로 넘어감
                    else if(j == one_skill.length()-1) {        // 순서에 맞지 않는 문자가 아니며, one_skill의 모든 문자를 검사 완료 한 경우 answer++
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
