import java.util.*;

class Pair implements Comparable<Pair>{
    int stage;
    double fail;

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setFail(double fail) {
        this.fail = fail;
    }

    public double getFail() {
        return fail;
    }

    @Override
    public int compareTo(Pair p){
        if(p.fail > fail) return -1;
        else if(p.fail < fail) return 1;
        return 0;
    }
}
public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] reached = new int[N];
        int[] present = new int[N];
        for(int i=0; i<N; i++) {
            reached[i] = 0;
            present[i] = 0;
        }

        for(int i=0; i<stages.length; i++){
            // stage에 도달한 사람 수 세기
            int j;
            if(stages[i] > N) j = N-1;
            else j = stages[i]-1;
            for(; j >= 0; j--) {
                reached[j]++;
            }
            if(stages[i] <= N) present[stages[i]-1]++;
        }

        List<Pair> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            Pair p = new Pair();
            p.setStage(i+1);
            if(present[i] != 0) p.setFail((present[i]*1.0)/reached[i]);
            else p.setFail(0);
            list.add(p);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<N; i++) answer[i] = list.get(i).getStage();
        return answer;
    }
}
