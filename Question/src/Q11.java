import java.util.Arrays;

public class Q11 {

    public long[] solutionQ11(int x, int n) {
        long[] answer = new long[n];

        //13,14테스트케이스 오류
        // 오류나서 오류의 문제점을 찾아봄 for문에 int를 long으로 변환해보라고 함.

        long sum = 0;

        for(int i = 0; i<n;i++){

            sum = sum + x;
            // 형변환.
            answer[i] += sum;
            //System.out.println(answer[i]);


        }


        // Arrays.toString() 을 사용하자 하나하나씩 출력한 것을 배열로 묶어서 스트리값으로 출력
        //System.out.println(Arrays.toString(answer));


        return answer;
    }

}
