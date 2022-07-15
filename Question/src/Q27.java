public class Q27 {

    public int solutionQ27(int num) {
        int answer = 0;

      // 맨 처음 작성한 코드
        while(num != 1){

            if(answer>=500){
                return -1;
            }

            if(num%2==0){
                num/=2;

                answer++;

            }else{
                num=(num*3)+1;

                answer++;
            }
        }
        return answer;



        // while문으로 시도 1

        // while문도 있다는 것을 기억하자.
//        while (num != 1) {
//            if (answer > 500) {
//                answer = -1;
//                return  answer;
//
//            }
//            if (num % 2 == 0) {
//                num = num / 2;
//                answer ++;
//            } else {
//                num = (num * 3) + 1;
//                answer ++;
//            }
//        }

        // while문으로 시도 2

//        while (true) {
//            if (num == 1){
//                // 여기서 빠져나가서 결국 초기값 answer가 0인상태로 반환됨
//                break;
//            }
//
//            if (num % 2 == 0) {
//                num /= 2;
//            } else {
//                num = (num * 3) + 1;
//            }
//
//            answer++;
//            if (answer >= 500){
//                return -1;
//            }
//        }
//
//        return answer;

        



//        for(int i = 1; i<=501; i++) {
//            if(num == 1) { // 1일 경우
//                break;
//            }
//
//            if(num % 2 == 0) { // 짝수
//                num = num / 2;
//                answer++;
//            } else { // 홀수
//                num = (num * 3) + 1;
//                answer++;
//            }
//
//            if(i == 501) { // 500번 반복해도 1이 아닐 경우
//                answer = -1;
//            }
//        }
//
//        return answer;


    }
}
