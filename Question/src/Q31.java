import java.util.ArrayList;
import java.util.Arrays;

public class Q31 {

    public int[] solutionQ31(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        int some  = -4;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != some) {

                arrayList.add(arr[i]);

                some = arr[i];
            }
        }

        System.out.println(arrayList);

        // arraylist to 1차원 배열 변환.
        answer = new int[arrayList.size()];
        int size = 0;
        for (int temp : arrayList) {
            answer[size++] = temp;
        }

        System.out.println(Arrays.toString(answer));



//        for (int i = 0; i < arrayList.size(); i++) {
//
//            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
//
//                arrayList.remove(i + 1);
//            }
//
//        }
//
//        System.out.println(arrayList);



            return answer;
        }

    }
