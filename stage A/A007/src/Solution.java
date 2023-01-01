import java.util.Scanner;
public class Solution {

    public static String solution() {
        String[] result = {"ascending", "descending", "mixed"};
        Scanner s = new Scanner(System.in);
        int usrInput;
        int testMode = 0;
        for(int i=0; i<8; i++) {
            usrInput = s.nextInt();
            if(i==0) {
                if(usrInput == 1) {
                    testMode = 0;
                }else if(usrInput == 8) {
                    testMode = 1;
                }
                else {
                    System.out.println(result[2]);
                    return result[2];
                }
            }
            else{
                if(testMode == 0 && usrInput != i+1) {
                    System.out.println(result[2]);
                    return result[2];
                }else if(testMode == 1 && usrInput != 8-i){
                    System.out.println(result[2]);
                    return result[2];
                }
            }
        }
        System.out.println(result[testMode]);
        return result[testMode];
    }
}
