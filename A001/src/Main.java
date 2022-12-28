import java.util.*;
/*
* 한 아이에게 최대 하나의 쿠키 분배
* greed factor : g[i] -> i(child)가 최소로 가져야 하는 쿠키의 사이즈
* cookie size : s[j] -> j(cookie)의 사이즈
* if s[j] >= g[i], j를 i에게 분배 가.
* goal : 최대한 많은 아이에게 쿠키를 나눠주기
*
* greed factor 가 큰 아이에게 쿠키 사이즈가 큰 것 배분해야 함.
* */
public class Main {
    public int findContentChildren(int[] g, int[] s) {
        // 오름 차순 정렬
        Arrays.sort(g);
        Arrays.sort(s);

        int result=0;

        // 역순으로 traverse하며 쿠키 사이즈가 큰 것부터 greed factor가 가장 큰 아이에게 배분
        for(int i=g.length-1; i>=0; i--){
            for(int j=s.length-1; j>=0; j--){
                if(s[j] >= g[i]){
                    result++;
                    s[j] = -1;  // 분배한 쿠키의 사이즈를 음수로 하여 없는 쿠키임을 표시
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Main me = new Main();
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int result = me.findContentChildren(g, s);
        System.out.println(result);
    }
}