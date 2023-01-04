import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
* Greedy 방식을 적용해야 함
*
* String을 number로 바꾸고, 각 자리 숫자를 list에 정렬해서
* 가장 높은 것 부터 원래 자리 대로 넣으면 됨.
* */
class Number implements Comparable<Number> {
    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    int number;
    @Override
    public int compareTo(Number o) {
        return (int)(this.number - o.getNumber());
    }
}
public class Solution {
    public String solution(String number, int k) {
        int n = Integer.parseInt(number);
        Map<Integer, Number> map = new HashMap<>();
        int i=0;
        while(true){
            Number object = new Number(n%10);
            map.put(i, object);
            n /= 10;
            if(n == 0) break;
            i++;
        }
        TreeMap<Integer, Number> sorted = new TreeMap<>(map);
        sorted.putAll(map);
        System.out.println(sorted);
        return "";
    }
}
