public class Solution {
    Character[] balloon = {'b', 'a', 'l', 'o', 'n'};
    int[] count = {0, 0,  0, 0, 0};
    public int maxNumberOfBalloons(String text) {
        for(int i=0; i<text.length(); i++){
            for(int j=0; j<balloon.length; j++){
                if(text.charAt(i) == balloon[j]){
                    count[j]++;
                }
            }
        }
        count[2] /= 2;
        count[3] /= 2;
        int min = count[0];
        for(int j=1; j<balloon.length; j++){
            if(count[j] < min){
                min = count[j];
            }
        }
        return min;
    }
}
