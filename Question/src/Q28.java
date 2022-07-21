import java.util.Arrays;

public class Q28 {

    public boolean solutionQ28(int x) {
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

        boolean answer = true;

        int [] temp_int = {};
        int sum = 0;

        //System.out.println(x);

        String temp = Integer.toString(x);

        String[] temp_arr = temp.split("");

        //System.out.println(Arrays.toString(temp_arr));

        temp_int = new int[temp_arr.length];

        for (int i = 0; i <temp_arr.length ; i++) {

            temp_int[i] = Integer.parseInt(temp_arr[i]);

        }

        for (int i = 0; i < temp_int.length ; i++) {

            sum+= temp_int[i];

            if(x%sum == 0){

                answer = true;

            }else {

                answer = false;
            }


        }

        System.out.println(sum);


        return answer;
    }

}
