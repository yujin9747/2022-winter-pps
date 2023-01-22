import java.util.HashSet;

public class Solution {
    String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        String code = "";
        HashSet<String> morseCodes = new HashSet<>();
        for(int i=0; i< words.length; i++){
            code = "";
            for(int j=0; j<words[i].length(); j++){
                code += morse[words[i].charAt(j) - 'a'];
            }
            morseCodes.add(code);
        }

        return morseCodes.size();
    }
}
