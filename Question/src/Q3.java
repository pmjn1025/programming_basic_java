public class Q3 {

    public String solutionQ3(String s) {
        //        문제 설명
        // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
        // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
        //
        //재한사항
        //s는 길이가 1 이상, 100이하인 스트링입니다.

        // 스캐너 클래스 입력.
        //Scanner scanner = new Scanner(System.in);

        // 문자열 입력 스캐너
        //String str = scanner.nextLine();

        //문제 형식
        String str = s;

        // 문자열 길이 입력
        int word_length = str.length();

        // 문자열 출력 확인
        //System.out.println("문자열 길이 : " + word_length);


        // 문자열 길이에 따른 if문
        if (word_length == 0) {

            System.out.println("텍스트를 입력해주세요");

        } else if (word_length <= 100) {
            //문자갯수가 홀수 이면
            if (word_length % 2 != 0) {

                System.out.println(str.charAt(word_length / 2));
                char examp = str.charAt(word_length / 2);
                char[] arr = {examp};
                str = new String(arr);


                //문자갯수가 짝수이면
            } else {

                // charAt 실험.
                //            for(int i = 0; i<word_length; i++){
                //
                //                    System.out.println(str.charAt(i));
                //
                //            }

                char examp = str.charAt((word_length / 2) - 1);
                //char examp1 = str.charAt((word_length/2)+1);
                char examp1 = str.charAt((word_length / 2));
                // 각각 출력 잘되는 지 확인
                //System.out.println(examp);
                //System.out.println(examp1);

                // char 문자 타입을 배열로 만듬
                char[] arr = {examp, examp1};
                // char -> 문자열타입인 String으로 형변환
                str = new String(arr);

            }

        } else if (word_length > 100) {

            System.out.println("텍스트입력범위 초과입니다.");


        }


        return str;

    }


}


