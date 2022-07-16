public class Q15 {
    public int solutionQ15(int[] a, int[] b) {

        int answer =0;

        //int sum = 0;

        for (int i = 0; i<a.length; i++){

            answer += a[i]*b[i];


            //answer += a[i]+b[i];


        }

        //System.out.println(sum);


        return answer;
    }
}
