public class Q17 {

    public boolean solutionQ17(String s) {

        boolean answer;
        char[] s_char = new char[s.length()];

        int count_num = 0;
        int count_char = 0;

        if(s.length() ==4 || s.length() == 6) {

            for (int i = 0; i < s.length(); i++) {

                //System.out.println(s.charAt(i));

                s_char[i] = s.charAt(i);

                // 문자열에 숫자가 몇개 문자가 몇개인지 검증.
                if (Character.isDigit(s_char[i])) {

                    count_num++;

                } else {

                    count_char++;

                }
            }
        } else {

            return false;

        }

        // 문자열이 모든 숫자인지 문자인지 검증.
        if(count_num == 0 && count_char == s.length()){

            return true;

        }else if(count_num == s.length() && count_char == 0){

            return true;

        }else {

            return false;

        }

//        System.out.println(count_num);
//        System.out.println(count_char);
//
//
//        return answer;
    }

}
