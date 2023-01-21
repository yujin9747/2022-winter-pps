import java.util.ArrayList;
import java.util.List;
import java.util.spi.ToolProvider;

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 1) return false;

        Character[] types = {'(', ')', '{', '}', '[', ']'};
        List<String> openBrackets = new ArrayList<>();
        int type=0;
        for(int i=0; i<s.length(); i++){
            // bracket의 종류 결정
            for(int j=0; j<6; j++){
                if(s.charAt(i) == types[j]) {
                    type=j;
                    break;
                }
            }

            if(type%2 == 0) openBrackets.add(types[type] + ""); // open
            else{
                if(openBrackets.size()==0) return false;    // open 되어있는 bracket이 없는데 close 하는 경우
                else if(openBrackets.get(openBrackets.size()-1).compareTo(types[type-1] + "")==0){ // valid로 닫힌 경우
                    openBrackets.remove(openBrackets.size()-1); // 닫힌 bracket 제거
                }
                else return false;  // 닫혀야 하는 bracket과 다른 타입으로 close되는 경우
            }

            // 남은 모든 문자열이 close라고 해도 valid하게 닫기에는 개수가 부족한 경우, speed를 위해 false 바로 리턴
            if(s.length()-i-1 < openBrackets.size()) return false;
        }
        if(openBrackets.size() > 0) return false;
        return true;
    }
}
