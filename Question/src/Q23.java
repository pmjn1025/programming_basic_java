
public class Q23 {
    public int[] solutionQ23(long n) {

//        long examp_long = n;
//        // int 배열로 받기위해 long에서 int로 형변환
//        int example_int = (int) examp_long;
//
//        //int[] answer = {};
//        int[] answer = new int[example_int];
//
//        for(int i = 0; i<example_int; i++){
//
//            answer[i] = example_int -i;
//        }
//
//        return answer;



        // int 배열로 받기위해 long에서 int로 형변환
        String example_str = String.valueOf(n);

        //int[] answer = {};

        int str_leng = example_str.length();

        int[] answer = new int[str_leng];

        //System.out.println(example_str.length());
        for(int i = str_leng-1; i>=0; i--){

            //System.out.println(example_str.charAt(i));
            //answer[i] = example_str.charAt(i);
            //System.out.println(Integer.parseInt(String.valueOf(example_str.charAt(i))));

            answer[i] = Integer.parseInt(String.valueOf(example_str.charAt(str_leng-1 - i)));

        }

        return answer;



    }
}
