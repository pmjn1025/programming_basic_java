public class Q13 {

    public String solutionQ13(int m, int d) {

        // 도저히 몰라서 예제 참고했습니다...............
        // XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        // XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        String answer = "";
        int y = 2016;

        // 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
        int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 요일명에 대한 배열 구성
        String[] weekNames = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        // 날수를 종합할 변수, 루프 변수, 요일 변수
        int nalsu, i, w;

        // 윤년에 따른 2월의 날 수 계산
        // 윤년이라면... 2월의 마지막 날짜를 29일로 설정 -> months[1] = 29
        // 평년이라면... 2월의 마지막 날짜를 28일로 설정 -> months[1] = 28
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)// 입력 년도가 윤년이라면...
        {
            // 2월의 마지막 날짜를 29일로 설정
            months[1] = 29;
        } else {
            months[1] = 28;
        }

        // ① 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일까지의 날 수 계산
        nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

        // ② 입력받은 월의 이전 월 까지의 날 수 계산 후
        //    1번 결과에 더하는 연산
        for (i = 0; i < (m - 1); i++)
            nalsu += months[i];

        // ③ 입력받은 일의 날짜만큼 날 수 계산 후
        //    2번 결과에 더하는 연산
        nalsu += d;

        //-------------------------------------------여기까지 날 수 연산 끝~!!!

        // 무슨 요일인지 확인하기 위한 연산
        w = nalsu % 7;    // 전체날수 %7 == 0 ->일요일
        // 전체날수 %7 == 1 ->월요일
        // 전체날수 %7 == 2 ->화요일

        answer = weekNames[w];

        return answer;
    }

}






