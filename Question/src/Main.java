import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Q2


        //Q3
        Q3 q3 = new Q3();
        //System.out.println(q3.solutionQ3("abcde"));



        //=================================================================

        //Q4
        Q4 q4 = new Q4();

        int a = 3;

        int b = 5;

        q4.solutionQ4(a,b);

        //=================================================================
        Q5 q5 = new Q5();
        q5.solutionQ5("-1234");

        //System.out.println(q5.solutionQ5("1234456"));



        //=================================================================

        Q6 q6 = new Q6();
        int [] arr_q6 = {5,8,4,0,6,7,9};
        //q6.solutionQ6(arr_q6);





        //=================================================================



        // 숫자 배열 확인 출력
//        for(int a : q7_int_list){
//
//            System.out.println();
//
//        }

        // 숫자 배열
        int[] q7_int_list = {-1, -2, 4};

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

        Q8 q8 = new Q8();

        int[] exam_list = {1,2,3,4};

        //q8.solutionQ8(exam_list);

        //=================================================================

        Q9 q9 = new Q9();

        String str_qq = "027778888";

        //q9.solutionQ9(str_qq);

        //System.out.println(q9.solutionQ9(str_qq));

        //=================================================================

        Q10 q10 = new Q10();
        int [][] arr1_q10 = {{1,2},{2,3}};
        int [][] arr2_q10 = {{3,4},{5,6}};

        //q10.solutionQ10(arr1_q10,arr2_q10);


        //=================================================================

        //x는 -10000000 이상, 10000000 이하인 정수입니다.
        int num_x = 2;
        //n은 1000 이하인 자연수입니다.
        int num_y = 5;

        Q11 q11 = new Q11();
        //System.out.println(Arrays.toString(q11.solutionQ11(-4, 2)));

        //=================================================================
        Q12 q12 = new Q12();
        int price_q12 = 3;
        int money_q12 = 30;
        int count_q12 = 4;


        //q12.solutionQ12(price_q12,money_q12,count_q12);
        //System.out.println(q12.solutionQ12(price_q12,money_q12,count_q12));

        //=================================================================

        Q13 q13 = new Q13(); // 나중에 풀기
        int month_q13 = 5;
        int day_q13 = 24;
//        q13.solutionQ13(month_q13,day_q13);
//        System.out.println(q13.solutionQ13(month_q13,day_q13));

        //=================================================================

        Q14 q14 = new Q14();
        int [] arr_q14 = {5, 9, 7, 10};
        //q14.solutionQ14(arr_q14,10);
        //System.out.println(Arrays.toString(q14.solutionQ14(arr_q14, 5)));




        //=================================================================

        Q15 q15 = new Q15();

        int[] num_q15_1 = {1, 2, 3, 4};
        int[] num_q15_2 = {-3, -1, 0, 2};
        // 배열 출력 확인.
        //System.out.println(Arrays.toString(num_q15_1) +  Arrays.toString(num_q15_2));

        //System.out.println(q15.solutionQ15(num_q15_1,num_q15_2));

        //=================================================================

        Q16 q16 = new Q16();
        String str_q16 ="Pyy";
        //q16.solutionQ16(str_q16);
        //System.out.println(q16.solutionQ16(str_q16));

        //=================================================================

        Q17 q17 = new Q17();
        String str_q17 ="123a";
        //q17.solutionQ17(str_q17);
        //System.out.println(q17.solutionQ17(str_q17));

        //=================================================================

        Q19 q19 = new Q19();
        int num_q19 = 3;

        //System.out.println(q19.solutionQ19(num_q19));

        //=================================================================

        Q18 q18 = new Q18();

        String [] arr ={"Jane","Kim","park","lee","William"};

       // q18.solutionQ18(arr);


        //=================================================================
        // 나중에 풀기
        Q20 q20 = new Q20();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        //q20.solutionQ20(participant,completion);

        //=================================================================

        Q21 q21 = new Q21();
        String str_q21 = "try hello world";
        //q21.solutionQ21(str_q21);

        //=================================================================
        Q22 q22 = new Q22();
        //q22.solutionQ22(123);

        //=================================================================

        Q23 q23 = new Q23();
        long num_q23 = 1234567;
        //q23.solutionQ23(num_q23);
        //System.out.println(Arrays.toString(q23.solutionQ23(num_q23)));

        //=================================================================
        Q23a q23a = new Q23a();
        long num_q23a = 1285921;
        //q23a.solutionQ23a(num_q23a);



        //=================================================================

        Q24 q24 = new Q24();

        long num_q24 = 118372;

        //q24.solutionQ24(num_q24);

        //=================================================================
        Q25 q25 = new Q25();
        //System.out.println(q25.solutionQ25(121));


        //=================================================================

        Q26 q26 = new Q26();
        int[] arr_q26 ={4,3,2,1};
        //q26.solutionQ26(arr_q26);


        //=================================================================

        Q27 q27 = new Q27();
        int num_q27 = 626331;
        //q27.solutionQ27(num_q27);
        //System.out.println(q27.solutionQ27(num_q27));

        //=================================================================

        Q28 q28 = new Q28();
        int x = 11;

        //System.out.println(q28.solutionQ28(x));
        //System.out.println(q28.solutionQ28(x));

        //=================================================================

        Q29 q29 = new Q29();
        int n = 125;
        //q29.solutionQ29(n);

        //=================================================================

        Q31 q31 = new Q31();
        int [] arr_q31 = {4,4,4,3,3};
        //q31.solutionQ31(arr_q31);


    }

}
