import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void solution() {
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        int student, sum, score, excellent;
        double avg;
        List<Integer> scores;
        for(int i=0; i<testcase; i++) {
            student = s.nextInt();
            sum=0;
            scores = new ArrayList<>();
            for(int j=0; j<student; j++) {
                score = s.nextInt();
                sum += score;
                scores.add(score);
            }
            excellent=0;
            avg = sum / (student*1.0) ;
            for(int j=0; j<student; j++){
                if(scores.get(j) > avg) excellent++;
            }
            System.out.printf("%.3f", ((excellent*1.0)/(student)*1.0)*100);
            System.out.println("%");
        }
    }
}
