import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();

        for(int i=0; i<operations.length; i++){
            if(operations[i].compareTo("+")==0){
                scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
            }else if(operations[i].compareTo("D")==0){
                scores.add(scores.get(scores.size()-1)*2);
            }else if(operations[i].compareTo("C")==0){
                scores.remove(scores.size()-1);
            }else{
                scores.add(Integer.parseInt(operations[i]));
            }
        }

        int sum=0;
        for(int i=0; i<scores.size(); i++) sum += scores.get(i);
        return sum;
    }
}
