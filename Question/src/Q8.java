public class Q8 {

    public double solutionQ8(int[] arr) {
        double answer = 0;
        double sum = 0;

        System.out.println(arr.length);

        for(int i = 0;i<arr.length; i++){

            //System.out.println(arr[i]);

            sum +=arr[i];
            answer = sum/arr.length;


        }

        return answer;
    }

}
