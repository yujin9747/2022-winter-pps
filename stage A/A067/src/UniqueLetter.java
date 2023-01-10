public class UniqueLetter {
    String str;

    public UniqueLetter() {
        this.str = "";
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getUniqueLetter(String str){
        char prev = '1';    // initial state : dummy data
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == prev) {
                this.str = this.str.substring(0, this.str.length()-1);
                if(this.str.length() == 0) prev = '1';  // 중간에 문자열이 빌 경우, 다시 더미 데이타 넣기 -> 인덱싱 오류 방지
                else prev = this.str.charAt(this.str.length()-1);
            }
            else {
                this.str += str.charAt(i);
                prev = str.charAt(i);
            }
        }
        return this.str;
    }
}
