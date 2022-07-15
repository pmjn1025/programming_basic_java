import java.util.Arrays; // ???

public class Main {

    public static void main(String[] args) {

        //Q2
        //Q2 q2 = new Q2();
        //System.out.println(q2.solutionQ2("abcde"));


//=================================================================
    
        // 숫자 배열
        int[] q7_int_list = {-1,-2,4};

        // 숫자 배열 확인 출력
//        for(int a : q7_int_list){
//
//            System.out.println();
//
//        }


        // 불린 배열 생성 하고 숫자 길이만큼 불린배열 크기 선언
        boolean[] signs = new boolean[q7_int_list.length];

        // 숫자 음양에 따라 양수면 true, 음수면 false
        for(int i = 0; i < q7_int_list.length; i++){

            if (q7_int_list[i] > 0){

                signs[i] = true;

            }else {

                signs[i] = false;

            }

        }

        // 불린에 넣은 값 출력해서 확인하기.
        for(boolean sign : signs){

            //System.out.println(sign);


        }

        Q7 q7 = new Q7();

       //System.out.println(q7.solutionQ7(q7_int_list,signs));


    }

    //=================================================================

    //x는 -10000000 이상, 10000000 이하인 정수입니다.
    int num_x;
    //n은 1000 이하인 자연수입니다.
    int num_y;

    Q11 q11 = new Q11();


}
