public class Q16 {
    boolean solutionQ16(String s) {
        boolean answer = true;
        // p,y문자가 있을때 카운트
        int count_p = 0;
        int count_y = 0;

        // 문자열을 소문자로 통일 시키기
        String s_lower = s.toLowerCase();

        // 문자열을 char로 하나씩 분리
        char s_char;

        for (int i = 0; i < s_lower.length(); i++) {

            s_char = s_lower.charAt(i);
            System.out.println(s_char);

            if(s_char == 'p'){

                    count_p++;

            }else if(s_char == 'y') {

                count_y++;

            }

        }

        if(count_p == count_y){

            return true;

        }else {

            return false;
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        //return answer;
    }
}
