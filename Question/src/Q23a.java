import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q23a {
    public long solutionQ23a(long n) {
        long answer = 0;

        String str ="";

        System.out.println(n);

        String ex = String.valueOf(n);

        String [] ex_arr = ex.split("");

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < ex_arr.length; i++) {

             arrayList.add(Integer.parseInt(ex_arr[i]));

        }

        Collections.sort(arrayList);

        //System.out.println(arrayList);


        int [] ex_int = new int[arrayList.size()];

        for (int i = arrayList.size()-1; i >=0 ; i--) {

            ex_int[arrayList.size()-1- i] = arrayList.get(i);

        }

       //System.out.println(Arrays.toString(ex_int));

        for (int i = 0; i < ex_int.length; i++) {

            str += String.valueOf(ex_int[i]);

        }

        //System.out.println(str);

        long some = Long.parseLong(str);

        answer=some;

        System.out.println(answer);

        return answer;
    }
}
