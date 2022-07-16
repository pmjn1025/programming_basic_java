public class Q9 {
    public String solutionQ9(String phone_number) {

    // substring 참고함.
    // .toCharArray()

        char[] phone_arr = phone_number.toCharArray(); // 출력 01033334444

        for(int i = 0; i < phone_arr.length - 4; i++) {
            phone_arr[i] = '*';
            // 출력 *******4444
        }

        //System.out.println(String.valueOf(phone_arr));

        return String.valueOf(phone_arr);


//        String answer = "";
//
//        for (int i = 0; i < phone_number.length() - 4; i++)
//            //answer += "*";
//
//            answer += phone_number.substring(phone_number.length() - 4);
//
//        return answer;



    }


}
