public class Example04 {
    public static void main(String[] args) {


        // Q1. 코드 출력 결과
            String a = "write once, run anywhere";
                if (a.contains("wife")) {
                    System.out.println("wife"); // false
                } else if (a.contains("once") && !a.contains("run")) {
                    System.out.println("once"); // false
                } else if (!a.contains("everywhere")) {
                    System.out.println("everywhere"); // true -> 실행되어 if문 빠져나감, 밑에 코드는 실행이 되지 않음
                } else if (a.contains("anywhere")) {
                    System.out.println("anywhere"); // true
                } else {
                    System.out.println("none"); // true
                }


        // Q2. while문 사용, 1~1000까지의 자연수 중 3의 배수의 합 구하기
            int i = 0;
            int sum = 0;

                while (i < 1000) {
                    i++;
                    if (i % 3 == 0) {
                        sum += i;
                    }
                }
            System.out.println("3의 배수의 합은 " + sum + " 입니다.");


        // Q3. while or for문 사용 별 찍기 5단
            for(int b=0; b<5; b++) {
                for(int c=0; c<=b; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            int d = 0;
                while(true) {
                    d += 1; // while문 수행 시 1씩 증가
                    if(d > 5) { // d 값이 5보다 크면 while문을 벗어남 (5줄 수행)
                        break;
                    }
                    for (int f=0; f<d; f++) { // d의 값만큼 *를 출력
                        System.out.print("*");
                    }
                    System.out.println();
                }


        // Q4. for 문 사용해서 1 ~ 100 숫자 출력하기
            for(int p=1; p<=100; p++) {
                System.out.print(p + " ");
                System.out.println();
            }


        // Q5. for each문 사용하여 A 학급의 평균 점수 구하기
            int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};

            int total = 0;
                for(int score:marks) {
                    total += score;
                }

            float average = (float) total / marks.length;
                System.out.println("A 학급의 평균 점수는 " + average + " 입니다.");


    }
}


