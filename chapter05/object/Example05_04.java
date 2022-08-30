package chapter05.object;

// Q9. 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해 설명


    interface Predator1 {
        String bark();
    }

    abstract class Animals {
        public String hello() {
            return "hello";
        }
    }

    class Dog1 extends Animals {
    }

    class Lion1 extends Animals implements Predator1 {
        public String bark() {
            return "Bark bark!!";
        }
    }


    public class Example05_04 {
        public static void main(String[] args) {

            Animals a = new Lion1();
            System.out.println(a.hello());  // hello
         // System.out.println(a.bark());   // a 객체가 Animals 타입으로 생성되었기 때문에 hello 메소드만 호출 가능

            Lion1 b = new Lion1();
            System.out.println(b.hello());  // hello
            System.out.println(b.bark());   // Bark bark!!

            Predator1 c = new Lion1();
         // System.out.println(c.hello());  // c 객체가 Predator1 타입으로 생성되었기 때문에 bark 메소드만 호출 가능
            System.out.println(c.bark());   // Bark bark!!


        }
    }