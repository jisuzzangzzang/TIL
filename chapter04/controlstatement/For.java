public class For {
    public static void main(String[] args) {


        // for문의 구조
/*
            for (초기치; 조건문; 증가치) {
                ...
            }
*/


        // 예제 (1)
            String[] numbers = { "one", "two", "three" };
                for (int i=0; i<numbers.length; i++) {
                    System.out.println(numbers[i]);
                }


            int[] marks = { 90, 25, 67, 45, 80 };
                for(int i=0; i<marks.length; i++) {
                    if(marks[i] >= 60) {
                        System.out.println((i+1) + "번 학생은 합격입니다.");
                    } else {
                        System.out.println((i+1) + "번 학생은 불합격입니다.");
                    }
                }


        // for와 continue
            int[] marks2 = { 90, 25, 67, 45, 80 };
                for(int i=0; i< marks2.length; i++) {
                    if(marks2[i] < 60) {    // 60점 미만인 학생인 경우 출력 부분 수행하지 않고 for문으로 돌아감
                        continue;
                    }
                    System.out.println((i+1) + "번 학생 축하합니다. 합격입니다.");
                }


        // 이중 for문
            for(int i=2; i<10; i++) {   // 2부터 9까지 반복 수행
                for(int j=1; j<10; j++) {   // 1부터 9까지 반복 수행
                    System.out.print(i*j+" ");
                }
                System.out.println("");
            }
    }
}


