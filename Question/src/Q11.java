import java.util.Arrays;

public class Q11 {

    public long[] solutionQ11(int x, int n) {
        long[] answer = new long[n];
        int sum = 0;

        for(int i = 0; i<n;i++){

            sum = sum + x;

            answer[i] += (long) sum;
            //System.out.println(answer[i]);


        }


        // Arrays.toString() 을 사용하자 하나하나씩 출력한 것을 배열로 묶어서 스트리값으로 출력
        //System.out.println(Arrays.toString(answer));


        return answer;
    }

}
