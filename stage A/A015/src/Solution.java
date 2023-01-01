import java.util.Scanner;

public class Solution {

    public int solution(){
        Scanner s = new Scanner(System.in);
        int sum=0;
        for(int i=0; i<5; i++){
            sum += Math.pow(s.nextInt(), 2);
        }
        return sum%10;
    }
}
