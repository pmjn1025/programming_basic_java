import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q26 {

    public int[] solutionQ26(int[] arr) {

        ArrayList<Integer>arrayList = new ArrayList<>();

        int [] answer = {};


        // 배열을 받아온다
        // 만약 배열의 1이상이면 로직 작동
        // 배열을 Arrays.sort()한다 오름차순하면 최소값은 0번째 최대값은 길이-1번째위치함.
        // 비교한값중 제일 작은 값을 배열에서 삭제한다




        //Arrays.sort(arr);

        if(arr.length >1) {

            for (int i = 0; i < arr.length; i++) {

                 arrayList.add(arr[i]);


            }

            System.out.println(arrayList);

           arrayList.remove(Collections.min(arrayList));

            answer = new int[arrayList.size()];


            for (int i = 0; i < arrayList.size(); i++) {

                answer[i] = arrayList.get(i);
            }


        } else if(arr.length ==1){

            arrayList.add(-1);

            answer = new int[arrayList.size()];

            answer[0] = -1;

        }

        System.out.println(Arrays.toString(answer));


        return answer;
    }
}
