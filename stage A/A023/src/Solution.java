public class Solution {
    public int addEachDigit(int num){
        int result=0;
        while(num > 0){
            result += num%10;
            num /= 10;
        }
        return result;
    }
    public int addDigits(int num) {
        while(num/10 > 0){
            num = addEachDigit(num);
        }
        return num;
    }
}
