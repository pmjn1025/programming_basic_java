public class Q7 {

    public int solutionQ7(int[] absolutes, boolean[] signs) {

        //false일때 왜??? 나는  += 해야 정답이 될까??
        // 일단 정답은 -=로 해서 맞췄음???
        
        // 정답 초기화
        int answer = 0;

        //boolean[] b = new boolean[absolutes.length];

        // 숫자 배열 길이만큼(== 불린 배열길이)
        for (int i = 0; i<absolutes.length;i++){
            //System.out.println(absolutes[i]);

            //숫자가 양수이면
            if(signs[i] == true){

                answer += absolutes[i];


                //숫자가 음수이면
            }else if(signs[i] == false) {

                //System.out.println(absolutes[i]);
                // ? 뭐지??? 나는 더하니까 정답이 나오는데 정답은 빼야 나오네??
                answer -= absolutes[i];

            }


        }

        return answer;

    }


}
