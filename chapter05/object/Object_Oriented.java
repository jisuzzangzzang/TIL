package chapter05.object;

// 객체지향 프로그래밍이 필요한 이유


    class Calculator {
        int result = 0;

    int add(int num) {
        result += num;
        return result;
    }

    int sub(int num) {
        result -= num;
        return result;
    }
}

    public class Object_Oriented {
        public static void main(String[] args) {
            Calculator cal1 = new Calculator(); // 계산기 1 객체 생성 (각각의 역할을 수행/독립적)
            Calculator cal2 = new Calculator(); // 계산기 2 객체 생성

                System.out.println(cal1.add(3));
                System.out.println(cal1.add(4));    // 7

                System.out.println(cal2.add(4));
                System.out.println(cal2.add(4));    // 8
        }
    }



