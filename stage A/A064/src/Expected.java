import java.util.Arrays;
/**
 * 리트코드와 같이 파일을 새로 생성해서 클래스를 만들 수 없는 경우, 한 파일 내에 다 작성하면 되는데
 * 이때 public class로 생성하지 말고 그냥 class로 생성해야 오류가 안생김.
 * **/
public class Expected {
    int[] heights;

    public int[] getHeights() {
        return heights;
    }

    public void setHeights(int[] heights) {
        this.heights = heights;
    }

    public int[] setSorted(int[] heights){
        int[] temp = new int[heights.length];
        for(int i=0; i<heights.length; i++) temp[i] = heights[i];

        this.heights = heights;
        Arrays.sort(this.heights);
        return temp;
    }

    public int getDifference(int[] heights){
        int count=0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != this.heights[i]) count++;
        }
        return count;
    }
}
