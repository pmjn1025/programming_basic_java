
import java.util.Arrays;


public class Q20 {

    public String solutionQ20(String[] participant, String[] completion) {

        // 나중에 풀기.....

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));

        int i;
        for (i=0; i<completion.length; i++){
            if (!participant[i].equals(completion[i])){

                answer = participant[i];
                return answer;

            }
        }

        //System.out.println(participant[i]);
        //System.out.println(arr_last);

        answer = participant[i];

        return answer;
    }
}