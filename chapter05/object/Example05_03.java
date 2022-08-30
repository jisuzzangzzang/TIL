package chapter05.object;

// Q8. 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해 설명


    interface Predator {
    }

    class Animal1 {
    }

    class Rabbit extends Animal1 {
    }

    class Hamster extends Animal1 implements Predator {
    }

    public class Example05_03 {
        public static void main(String[] args) {
            Animal1 a = new Animal1();  // 객체 a는 Animal1의 객체이다. (IS-A 성립)
            Animal1 b = new Rabbit();  // 객체 b Rabbit은 Animal1 클래스의 객체이다. (IS-A 성립)
            Animal1 c = new Hamster();  // 객체 c Hamster는 Animal1 클래스의 객체이다. (IS-A 성립)
            // Rabbit d = new Animal1();
            /*
                객체 d Animal1은 Rabbit의 객체이다. -> 오류 발생
                Rabbit 클래스는 Animal의 자식 클래스로 IS-A 관계가 성립될 수 없다.
             */
            Predator e = new Hamster();  // 객체 e Hamster는 인터페이스 predator의 객체이다. (IS-A 성립)


        }
    }