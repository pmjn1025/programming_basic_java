import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q14 {
    public int[] solutionQ14(int[] arr, int divisor) {


//        int[] answer = {};
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i]%divisor==0){
//                arrayList.add(arr[i]);
//            }
//        }
//
//        if(arrayList.isEmpty()) {
//            arrayList.add(-1);
//        }
//
//        answer = new int[arrayList.size()];
//
//        for(int i=0; i<arrayList.size(); i++) {
//            answer[i] = arrayList.get(i);
//        }
//
//        Arrays.sort(answer);
//
//        return answer;


        ArrayList<Integer> arrayList = new ArrayList<>();

        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
                Collections.sort(arrayList);


            } else if (arr[i] % divisor != 0) {

                if (arrayList.size() == 0) {

                    arrayList.add(-1);

                }
            }
        }


            System.out.println(arrayList);
            answer = new int[arrayList.size()];
            int size = 0;
            for (int temp : arrayList) {
                answer[size++] = temp;
            }

        return answer;

    }

}
