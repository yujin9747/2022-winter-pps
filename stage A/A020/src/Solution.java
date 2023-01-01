import java.util.Scanner;

public class Solution {

    static void solution(){
        Scanner s = new Scanner(System.in);
        int cur=0, max=-1;
        for(int i=0; i<4; i++) {
            cur -= s.nextInt();
            cur += s.nextInt();
            if(cur > max) max = cur;
        }
        System.out.print(max);
    }
}
