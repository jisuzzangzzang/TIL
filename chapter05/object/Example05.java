import java.util.ArrayList;
import java.util.Arrays;

class Calculator2 {
        int value;

        Calculator2() {
            this.value = 0;
        }

        void add(int val) {
            this.value += val;
        }

        int getValue() {
            return this.value;
        }


// Q4. 배열 또는 리스트 입력 시 평균 값을 구해 정수로 리턴하는 avg 메소드 추가
        int avg(int[] data) {
            int total = 0;
            for (int num : data) {
                total += num;
            }
            return total / data.length;
        }

        int avg(ArrayList<Integer> data) {
            int total = 0;
            for(int num : data) {
                total += num;
            }
            return total / data.size();
        }


// Q3. 홀수인지 짝수인지 판별해주는 메소드(isOdd)를 추가, 홀수이면 true / 짝수이면 false 리턴

        boolean isOdd(int num) {
            return num % 2 == 1;    // 홀수면 true 이기 때문에 나머지 값을 1로 설정
        }
    }


// Q1. Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메소드를 추가
    class UpgradeCalculator extends Calculator2 {
        // Calculator2을 상속하고 minus 메소드를 구현한 UpgradeCalculator 클래스 생성
        void minus(int val) {
            this.value -= val;
        }
    }


// Q2. 객체변수 value가 100 보다 큰 값을 가질 수 없도록 제한하는 MaxLimitCalculator 클래스 만들기
    class MaxLimitCalculator extends Calculator2 {
        // Calculator2를 상속
        void add(int val) { // add 메소드 오버라이딩
            this.value += val;
            if(this.value > 100) {  // 각 값을 더한 값이 100보다 클 때
                this.value = 100;   // 최대값 100을 출력한다.
            }
        }
    }


    public class Example05 {
        public static void main(String[] args) {

            // Q1
            UpgradeCalculator cal3 = new UpgradeCalculator();
            cal3.add(10);
            cal3.minus(3);
            System.out.println(cal3.getValue());    // 10 에서 7을 뺀 3 출력


            // Q2
            MaxLimitCalculator cal4 = new MaxLimitCalculator();
            cal4.add(50);
            cal4.add(60);
            System.out.println(cal4.getValue());    // 110이지만 최대값을 100으로 설정해놨으므로 100 출력


            // Q3
            System.out.println(cal3.isOdd(4)); // false
            System.out.println(cal3.isOdd(3));  // true


            // Q4
            int[] data = {1, 3, 5, 7, 9};
            Calculator2 calculator2 = new Calculator2();
            int result = calculator2.avg(data);
            System.out.println(result);

            ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
            Calculator2 calculator4 = new Calculator2();
            int result2 = calculator4.avg(data2);
            System.out.println(result2);


            // Q5. 출력 결과를 예측하고 이유에 대해 설명
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
            ArrayList<Integer> b = a;     // 동일한 리스트 객체를 가리키고 있음
            a.add(4);
            System.out.println(b.size()); // 4
            System.out.println(a==b);     // true

            // 동일한 값을 가지지만 독립적으로 생성하고 싶으면?
                ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3));
                ArrayList<Integer> d = new ArrayList<>(c);  // 리스트 값은 1, 2, 3 같지만 다른 객체임
                c.add(4);
                System.out.println(d.size()); // 3 출력 (c 객체에 요소를 추가했으나 d는 c와 다른 객체므로 요소가 추가되지 않음)
                System.out.println(c==d);     // false



        }
    }



