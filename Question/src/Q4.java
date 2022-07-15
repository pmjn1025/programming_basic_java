public class Q4 {

    public long solutionQ4(int a, int b) {
        long answer = 0;
        // b가 a보다 클때
        if (a<b){
            // 초기값이 a이고 조건식이 b와 같을때 까지 반복
            for(int i = a; i<=b; i++){

                answer += i;

            }

        // a==b이면 아무값 반환 a로 반환함
        }else if (a == b){

                answer = a;
            //a가 b보다 클때
        }else if(a>b){

            // 초기값이 b이고 조건식이 a와 같을때 까지 반복함.
            for(int i = b; i<=a; i++){

                answer += i;

            }


        }
        return answer;
    }

}
