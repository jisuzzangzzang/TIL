package chapter04.controlstatement;

public class Switch_Case {
    public static void main(String[] args) {


        // switch/case문의 구조
/*
            switch(입력변수) {
                case 입력값1: ...
                    break;
                case 입력값2: ...
                    break;
                ...
                default: ...
                    break;
            }
*/


        // 예제 (1)
            int month = 15;
            String monthString = "";
                switch (month) {
                    case 1:  monthString = "January";
                        break;
                    case 2:  monthString = "February";
                        break;
                    case 3:  monthString = "March";
                        break;
                    case 4:  monthString = "April";
                        break;
                    case 5:  monthString = "May";
                        break;
                    case 6:  monthString = "June";
                        break;
                    case 7:  monthString = "July";
                        break;
                    case 8:  monthString = "August";
                        break;
                    case 9:  monthString = "September";
                        break;
                    case 10: monthString = "October";
                        break;
                    case 11: monthString = "November";
                        break;
                    case 12: monthString = "December";
                        break;
                    default: monthString = "Invalid month"; // 숫자가 아닌 다른 값이 저장되면 default 문장 출력
                        break;
                }

            System.out.println(monthString);


        // switch/case문은 if else문으로 변경 가능, if else문은 switch/case문으로 변경 불가능
        // 입력 값이 정형화 되있는 경우 switch/case문 가독성 좋음


    }
}



