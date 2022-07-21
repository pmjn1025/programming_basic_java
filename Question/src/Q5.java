public class Q5 {

    public int solutionQ5(String s) {
        int answer = 0;

        int some = Integer.parseInt(s);

        if (s.length() >= 1 && s.length()<=5) {
            if (some > 0) {

                answer = some;

            } else if (some < 0) {

                answer = some;
            }

        }

        return answer;
    }

}
