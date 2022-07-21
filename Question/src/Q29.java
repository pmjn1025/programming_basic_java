import java.util.Arrays;

public class Q29 {

    public int solutionQ29(int n) {
        int answer = 0;

        System.out.println(n);

       String three = Integer.toString(n,3);

       String[] three_rev = three.split("");

       int [] num = new int[three_rev.length];

        for (int i = three_rev.length-1; i >= 0 ; i--) {

            System.out.println(three_rev[i]);

            num[i] = Integer.parseInt(three_rev[three_rev.length-1 -i]);

        }

        System.out.println(Arrays.toString(num));

        String str = Arrays.toString(num).replaceAll("[^0-9]","");
        System.out.println( str );
        System.out.println(Integer.parseInt(str,3));

        answer = Integer.parseInt(str,3);




        return answer;
    }

}
