import java.util.Arrays;
import java.util.Collections;

public class Q24 {

    public long solutionQ24(long n) {
        long answer = 0;

        String convert = Long.toString(n);

        String some = "";

        System.out.println(convert);

        long[] long_arr = new long[convert.length()];


        for (int i = 0; i < convert.length(); i++) {

            //ch_arr[i] = convert.charAt(i);

            long_arr[i] = (long) Integer.parseInt(String.valueOf(convert.charAt(i)));

        }

        System.out.println(Arrays.toString(long_arr));

        for (int j = 0; j < long_arr.length; j++) {
            for (int k = 0; k < long_arr.length - 1; k++) {
                //값을 바꾸는 코드
                if (long_arr[k] < long_arr[k + 1]) {//오름차순 , 내림차순으로 바꾸고 싶으면 부등호 바꾸면 됨
                    long temp = long_arr[k];
                    long_arr[k] = long_arr[k + 1];
                    long_arr[k + 1] = temp;


                }
            }
        }

        System.out.println(Arrays.toString(long_arr));


        for(int l = 0; l < long_arr.length; l++){

            some += String.valueOf(long_arr[l]);

        }

        System.out.println(some);

        answer = (long) Integer.parseInt(some);

        //System.out.println(answer);


        return answer;



//        long answer = 0;
//
//
//        String number = Long.toString(n);
//
//
//        String arr[] = new String[number.length()];
//        for (int i = 0; i < number.length(); i++){
//            arr[i] = number.substring(i, i + 1);
//        }
//
//
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        String result = "";
//        for (String i : arr) {
//            result += i;
//        }
//
//
//        return Long.parseLong(result);



    }
}