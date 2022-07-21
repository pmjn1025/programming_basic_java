import java.util.Arrays;

public class Q22 {

    public int solutionQ22(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(n);

        String ex = String.valueOf(n);

        System.out.println(ex);

        String [] ex_arr = ex.split("");

        System.out.println(Arrays.toString(ex_arr));

        int sum = 0;
        for (int i = 0; i < ex_arr.length; i++) {

            sum += Integer.parseInt(ex_arr[i]);

        }

        answer =sum;


        return answer;
    }

}
