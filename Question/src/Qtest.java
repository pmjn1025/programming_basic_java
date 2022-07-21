import java.util.ArrayList;
import java.util.Arrays;

public class Qtest {


    public int solution(int[] arr1, int[] arr2) {

        //체크인 페이지는 체크아웃이 새벽 5시(""29""") 정각이나 새벽 5시를 넘어가면 체크아웃을 깜빡한 것으로 간주한다.
        //따라서 새벽 5시가 넘어가 체크아웃을 하게 되면 자동으로 체크아웃을 오후 9시(21시)로 한 것으로 처리한다.

        // 문제 출력값 확인.

//       int a [] = {9, 9, 8, 8, 7, 8, 9};
//       int b [] = {21, 25, 21, 21, 22, 23, 21};
//
//       int sum = 0;
//       for(int i = 0; i< a.length;i++){
//
//           System.out.println((b[i]-a[i]));
//           sum+= (b[i]-a[i]);
//
//       }
//
//        System.out.println(sum);


        // if문으로 checkout의 값이 25이상이면 21로 입력하기.
        // 배열의 길이는 7로 같다 --> 7일 이니까.
        // 지정 입력값
        //int check_in [] = {9, 9, 9, 9, 7, 9, 8};
        //int check_out [] = {23, 23, 30, 28, 30, 23, 23};


        int answer = 0;


        ArrayList<Integer> check_in = new ArrayList<>();
        ArrayList<Integer> check_out = new ArrayList<>();

        // checkout- checkin의 합



        for (int k = 0; k<arr1.length;k++){

            check_in.add(arr1[k]);


        }

        for (int l = 0; l<arr2.length;l++){

            check_out.add(arr2[l]);

        }

        System.out.println(check_in);
        System.out.println(check_out);

        for(int i = 0; i< check_in.size();i++){

            // 체크아웃 리스트 내용을 변경
            // 새벽 5시정각 이상이면 21로 바꾼다.
            // 숫자는 29이다!!!!!!
            if (check_out.get(i)>=29){

                // 해당인덱스는 삭제하고
                check_out.remove(i);

                // 삭제한 순서의 인덱스에 21을 추가한다.
                check_out.add(i,21);

            }
        }


        for (int j = 0; j<check_out.size();j++){

            answer += check_out.get(j)-check_in.get(j);

        }

        //System.out.println(sum);



        return answer;
    }



    public static void main(String[] args) {


        Qtest method = new Qtest();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));








    }


}
