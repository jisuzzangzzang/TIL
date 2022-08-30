

// Q6. 코드에서 오류가 발생하지 않도록 수정하기


    class Calculation {
        Integer value;

    // Integer 자료형은 값을 대입하지 않을 경우 null이기 때문에 add 메소드에서 null에 값을 더하려고 하기 때문에 오류 발생
    // Calculation 클래스의 생성자를 만들고, 초기값을 설정해줘야 함.
        Calculation() {
            this.value = 0;
        }

        void add(int val) {
            this.value += val;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    public class Example05_01 {
        public static void main(String[] args) {
            Calculation cal = new Calculation();
            cal.add(3);  // 여기서 NullPointerException 이 발생한다.
                System.out.println(cal.getValue());


        }
    }