import java.util.Arrays;

public class Q18 {

    public String solutionQ18(String[] seoul) {
        String answer = "";

        if(seoul.length>=1 && seoul.length <= 1000) {

            for (int i = 0; i < seoul.length; i++) {

                if (seoul[i].equals("Kim")) {

                    answer = "김서방은 " + i+"에" + " 있다";


                }


            }

        }


        System.out.println(answer);
        return answer;
    }

}
