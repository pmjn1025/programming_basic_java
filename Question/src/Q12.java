public class Q12 {

    public long solutionQ12(int price, int money, int count) {
        long answer = -1;
        // int를 long으로 변환
        long sum = 0;
        long amuont = 0;
        for(int i = 1; i <= count; i++){

            sum = price*i;
            System.out.println(i+"번째 합 : "+sum);

            amuont += sum;


        }

        System.out.println("총합:"+amuont);

        // 부족하면 0 포함되면 안될까 다쓴거니까
        if(amuont>money){

           answer = amuont - money;

           return answer;

        // 부족하지 않으면 이면 0 포함되는거 아닐까?. 아.......
        }else if(amuont<=money){

            return 0;

        }

        //System.out.println(answer);


        return answer;
    }

}
