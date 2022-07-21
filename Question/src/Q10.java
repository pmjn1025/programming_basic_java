import java.util.ArrayList;
import java.util.Arrays;

public class Q10 {
    public int[][] solutionQ10(int[][] arr1, int[][] arr2) {


//        int[][] answer = {};
//        ans = arr1;
//
//        for (int i =0; i<arr1.length; i++){
//            for( int j=0; j<arr1[j].length; j++){
//                ans[i][j] += arr2[i][j];
//            }
//        }
//        return ans;
        // {{1,2},{2,3}}; == arr1
        // {{3,4},{5,6}}; == arr2
        // new int[배열 안의 배열 개수][배열안의 배열안의 원소의 갯수];
        int[][] arr = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];

                System.out.println( arr[i][j]);
            }
        }



        return arr;



//        int[][] answer = new int[arr1.length][arr2.length];
//
//        ArrayList<Integer> arrayList_arr1 = new ArrayList<>();
//        ArrayList<Integer> arrayList_arr2 = new ArrayList<>();
//        ArrayList<Integer> arrayList_arr3 = new ArrayList<>();
//
//
//
//            int[] arr_1 = new int[arr1.length + arr2.length];
//
//
//            int some = 0;
//
//            for (int i = 0; i < arr1.length; i++) {
//
//                for (int j = 0; j < arr2.length; j++) {
//
//                    some = arr1[i][j];
//
//                    arrayList_arr1.add(some);
//
//                    System.out.println(some);
//
//                }
//            }
//
//            System.out.println(arrayList_arr1);
//
//            for (int i = 0; i < arr2.length; i++) {
//                for (int j = 0; j < arr2.length; j++) {
//
//                    some = arr2[i][j];
//
//                    arrayList_arr2.add(some);
//
//                }
//
//            }
//
//            System.out.println(arrayList_arr2);
//
//
//            for (int i = 0; i < arrayList_arr1.size(); i++) {
//
//                int tempInt = arrayList_arr1.get(i);
//                int tempInt1 = arrayList_arr2.get(i);
//                int suum = tempInt + tempInt1;
//
//                System.out.println(tempInt + tempInt1);
//
//
//                arrayList_arr3.add(tempInt + tempInt1);
//
//                arr_1[i] = suum;
//
//            }
//            int count = 0;
//            for (int i = 0; i < arr1.length; i++) {
//                for (int j = 0; j < arr2.length; j++) {
//
//                    answer[i][j] = arr_1[count];
//                    count++;
//
//                }
//
//            }
//
//            System.out.println(Arrays.deepToString(answer));
//
//        return answer;

    }
}
