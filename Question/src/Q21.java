import java.util.Arrays;

public class Q21 {

    public String solutionQ21(String s) {

        // StringBuilder로 String answer = ""; 해서 answer += ""하는 것 보다 안정적이고 메모리를 효율적으로
        // 사용한다고 한다.
        //StringBuilder answer = new StringBuilder();
        String answer = "";
        String[] s_arrs = s.split("");
        System.out.println(s_arrs.length);
        System.out.println(Arrays.toString(s_arrs));

        int idx =0;
        for (int i = 0; i<s_arrs.length;i++){
            if(s_arrs[i].equals(" ")){
                //answer += "";
                idx = 0;

            }else if (idx%2 ==0){
                s_arrs[i] = s_arrs[i].toUpperCase();
                idx++;

            } else if(idx%2 != 0){

                s_arrs[i] = s_arrs[i].toLowerCase();
                idx++;
            }
            answer +=  s_arrs[i];
        }
        System.out.println(answer);
        return answer;
    }
}
