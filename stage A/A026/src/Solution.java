public class Solution {
    public int sum(int x){
        int result=0;
        while(true){
            result += x%10;
            x /= 10;
            if(x == 0) break;
        }
        return result;
    }
    public boolean solution(int x) {
        int sum = sum(x);
        if(x%sum == 0) return true;
        return false;
    }
}
