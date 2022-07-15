public class Q19 {

    public String solutionQ19(int n) {
        String answer = "";

        // substring 함수사용하는 줄 알았다. 문제이해 못함.
        //answer.substring(0, n);
        
        // 각각의 문자열을 입력해서 매개변수 n만큼 반복해서 출려하는 것이 포인트

        for(int i = 0; i<n ; i++){

            if (i %2 ==0){

                answer +="수";

            }else if(i%2 != 0){

                answer +="박";

            }


        }



        return answer;
    }

}
