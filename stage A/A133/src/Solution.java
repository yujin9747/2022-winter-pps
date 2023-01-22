import java.util.StringTokenizer;

public class Solution {
    public String capitalizeTitle(String title) {
        String result = "";
        StringTokenizer tokenizer = new StringTokenizer(title);
        String token="";
        while(true){
            token = tokenizer.nextToken();
            if(token.length() <= 2){
                result += token.toLowerCase();
            }
            else {
                result += token.substring(0, 1).toUpperCase();
                result += token.substring(1, token.length()).toLowerCase();
            }
            if(tokenizer.hasMoreTokens()) result += " ";
            else break;
        }
        return result;
    }
}
