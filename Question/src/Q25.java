import java.util.Arrays;

public class Q25 {

    public long solutionQ25(long n) {

//        double x = Math.sqrt(n);
//
//        if(x == (int )x){
//
//            return(long) Math.pow(x+1,2);
//        }else {
//            return -1;
//        }

        long answer = 0;


        double temp =  Math.sqrt(n);

        String temp_ex = Double.toString(temp);



        String [] str_arr = temp_ex.split("");

        //System.out.println(Arrays.toString(str_arr));

//        char[] ch_arr = temp_ex.toCharArray();
//
//        System.out.println(Arrays.toString(ch_arr));

        if(n != 0) {

            long count = 0;

            for (long i = 0; i < str_arr.length; i++) {

                if (str_arr[(int) i].equals(".")) {

                    count = i;

                }

            }

            //System.out.println(count);

            for (long i = count; i < str_arr.length; i++) {

                //System.out.println(str_arr[count+1]);
                if (str_arr[(int) (count + 1)].equals("0")) {
                    answer = (long) ((temp + 1) * (temp + 1));
                    return answer;


                } else if (!str_arr[(int) (count + 1)].equals("0")) {
                    answer = -1;
                    return answer;
                }

            }
        }

        //System.out.println(answer);

        return answer;
    }

}
