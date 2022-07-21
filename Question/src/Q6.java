import java.util.Arrays;

public class Q6 {

    public int solutionQ6(int[] numbers) {
        int answer = -1;

        int [] arr = {0,1,2,3,4,5,6,7,8,9};

        int sum_arr = 0;
        int sum_arr1 = 0;

        for (int i = 0; i<arr.length;i++){

            sum_arr+= arr[i];

            for (int j = 0; j<numbers.length;j++){

                if (arr[i] == numbers[j]){

                   sum_arr1+=arr[i];


                }

            }
        }

        answer = sum_arr-sum_arr1;


        return answer;
    }

}
