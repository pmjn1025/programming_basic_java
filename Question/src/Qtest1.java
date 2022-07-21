import java.util.ArrayList;
import java.util.Arrays;

public class Qtest1 {

    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {

        // 1. 각 숫자에 따른 음양에 따른 +-를 확인하기
        // 2. sign 배열의 첫번째 배열이 arr_1의 부호를 결정하고
        //  [5, 7, 1, 2, 3, 5]
        // 3. sign 배열의 두번째 배열이 arr_2의 부호를 결정한다.
        //  [5, 1, 6, 7, 5, 6]
        // 4. 각 배열의 부호를 적용해서 1차원 배열로 바꾼다.
        // 4-1. 배열의 부호는 true이면 1, false이면 -1로 생성해 새로운 Integer형 배열을 만든다.
        // [1, 1, -1, -1, 1, -1]
        // arr1[0],arr2[0]이 sign의 순서와 같으니까 sigin의 순서에따라
        // 1이면 1을 각각 곱한해서 해서 합한결과를 새로운 배열에다가 담는다.
        // [10, 8, -7, -9, 8, -11]
        // 5. 현재 arraylist에 담아서 새로운 int 배열에 담는다.
        // 6. int 배열에 담은 것을 2개로 분할 한다.
        // 6. 2개로 분할된 배열을 다시 2차원 배열로 생성한다.


        int[][] answer = {{}};

        //int[] arr1All = new int[arr1[0].length + arr1[1].length];

        ArrayList<Integer> arrayListArr1 = new ArrayList<>();
        ArrayList<Integer> arrayListArr2 = new ArrayList<>();
        ArrayList<Integer> arrayListArrSum = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {

              arrayListArr1.add(arr1[i][j]);
                
            }

        }

        System.out.println(arrayListArr1);




        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {

                arrayListArr2.add(arr2[i][j]);

            }


        }

        System.out.println(arrayListArr2);

        ArrayList<Integer> arrayListBol = new ArrayList<>();

        for (int i = 0; i < signs.length; i++) {
            for (int j = 0; j < signs[0].length; j++) {

                if (signs[i][j] == true){

                    arrayListBol.add(1);


                }else if(signs[i][j] == false){

                    arrayListBol.add(-1);

                }

            }


        }

        System.out.println(arrayListBol);

        // arr1, arr2 부호적용해서 합한결과를 새로운 배열에다가 담는다.

        for (int i = 0; i < arrayListArr1.size(); i++) {

            if (arrayListBol.get(i) == 1){

                arrayListArrSum.add(arrayListArr1.get(i)+(arrayListArr2.get(i)));


            }else if(arrayListBol.get(i) == -1){

                arrayListArrSum.add((arrayListArr1.get(i)*-1)+(arrayListArr2.get(i)*-1));



            }

        }

        System.out.println(arrayListArrSum);


        int [] arrDiv1 = new int [arrayListArrSum.size()];

        arrDiv1 = new int[arrayListArrSum.size()];
        int size = 0;
        for (int temp : arrayListArrSum) {
            arrDiv1[size++] = temp;
        }


        System.out.println(Arrays.toString(arrDiv1));

        int n = arrDiv1.length;
        int[] split1 = new int[(n + 1)/2];
        int[] split2 = new int[n - split1.length];

        for (int i = 0; i < n; i++)
        {
            if (i < split1.length) {
                split1[i] = arrDiv1[i];
            }
            else {
                split2[i - split1.length] = arrDiv1[i];
            }
        }

        System.out.println(Arrays.toString(split1));
        System.out.println(Arrays.toString(split2));

        answer = new int[split1.length-1][split2.length];

        for (int i = 0; i < split1.length; i++) {
            for (int j = 0; j < split2.length; j++) {

                if(i == 0){

                    answer[i][j] = split1[j];


                } else if(i == 1){

                    answer[i][j] = split2[j];

                }


            }
        }

        //System.out.println(Arrays.deepToString(answer));



        return answer;
    }

    public static void main(String[] args) {


        Qtest1 qtest1 = new Qtest1();
        int[][] arr1 = {{5,7,1},{2,3,5}};
        int[][] arr2 = {{5,1,6},{7,5,6}};
//        int[][] arr1 = {{5,7,1},{2,3,5}};
//        int[][] arr2 = {{6,1,6},{7,5,6}};
        boolean[][] signs={{true,true,false},{false,true,false}};
        qtest1.solution(arr1, arr2, signs);
        System.out.println(Arrays.deepToString(qtest1.solution(arr1, arr2, signs)));

    }
}
