import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {

    public void solution() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // initialization
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(s.nextInt());
        }
        for(int i=0; i<n; i++){
            B.add(s.nextInt());
        }

        // 역순 정렬
        Collections.sort(A, Collections.reverseOrder());
        // A의 가장 큰 수부터, B의 가장 작은 수를 찾아 곱해서 더한다.
        int result = 0;
        for(int i=0; i<n; i++){
            AtomicInteger minB = new AtomicInteger();

            // B의 가장 작은 수를 찾는다.
            IntStream
                    .range(0, B.size())
                    .forEach((index) -> {
                        minB.set(B.stream().min(Integer::compare).orElse(-1));
                    });

            // A의 가장 큰 수와 B의 가장 작은 수를 곱해서 더한다
            result += A.get(i)*minB.get();
            // B의 가장 작은 수를 삭제한다. (값으로 삭제)
            B.remove(Integer.valueOf(minB.intValue()));
        }

        // 결과 출력
        System.out.println(result);
    }
}
