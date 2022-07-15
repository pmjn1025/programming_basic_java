import java.util.Arrays; // ???

public class Main {

    public static void main(String[] args) {

        //Q3
        Q3 q3 = new Q3();
        System.out.println(q3.solutionQ3("abcde"));


        //=================================================================

        //Q4
        Q4 q4 = new Q4();

        int a = 3;

        int b = 5;

        q4.solutionQ4(a,b);





        //=================================================================

        // 숫자 배열
        int[] q7_int_list = {-1, -2, 4};

        // 숫자 배열 확인 출력
//        for(int a : q7_int_list){
//
//            System.out.println();
//
//        }


        // 불린 배열 생성 하고 숫자 길이만큼 불린배열 크기 선언
        boolean[] signs = new boolean[q7_int_list.length];

        // 숫자 음양에 따라 양수면 true, 음수면 false
        for (int i = 0; i < q7_int_list.length; i++) {

            if (q7_int_list[i] > 0) {

                signs[i] = true;

            } else {

                signs[i] = false;

            }

        }

        // 불린에 넣은 값 출력해서 확인하기.
        for (boolean sign : signs) {

            //System.out.println(sign);


        }

        Q7 q7 = new Q7();

        //System.out.println(q7.solutionQ7(q7_int_list,signs));


        //=================================================================

        //x는 -10000000 이상, 10000000 이하인 정수입니다.
        int num_x = 2;
        //n은 1000 이하인 자연수입니다.
        int num_y = 5;

        Q11 q11 = new Q11();
        //System.out.println(Arrays.toString(q11.solutionQ11(-4, 2)));

        //=================================================================

        Q15 q15 = new Q15();

        int[] num_q15_1 = {1, 2, 3, 4};
        int[] num_q15_2 = {-3, -1, 0, 2};
        // 배열 출력 확인.
        //System.out.println(Arrays.toString(num_q15_1) +  Arrays.toString(num_q15_2));

        //System.out.println(q15.solutionQ15(num_q15_1,num_q15_2));

        //=================================================================

        Q19 q19 = new Q19();
        int num_q19 = 3;

        //System.out.println(q19.solutionQ19(num_q19));

        //=================================================================

        Q23 q23 = new Q23();
        long num_q23 = 1234567;
        q23.solutionQ23(num_q23);
        System.out.println(Arrays.toString(q23.solutionQ23(num_q23)));






    }

}
