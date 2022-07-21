public class Q13 {

    public String solutionQ13(int a, int b) {

        String answer = "";

        //1월1일이 금요일이니까 계산하기 편하도록 일주일 중 금요일이 시작처럼 배열
        String[] day={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] last={31,29,31,30,31,30,31,31,30,31,30,31};
        //2016년의 몇번째 날인지 저장할 변수
        int date=0;

        //1.월별 마지막 날 수의 합
        for(int i=0; i<a-1; i++){
            date += last[i];
        }
        //2.a-1달까지의 일수 + a달의 일수
        date += b-1;

        //3.일수%7로 요일 구해서 리턴
        return day[date%7];


    }

}






