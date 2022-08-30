package chapter05.object;

// 추상 클래스 (Abstract Class)
/*
    - 인터페이스의 역할도 하면서 클래스의 기능도 가지는 클래스
    - 추상클래스는 인터페이스로 대체하는 것이 좋은 디자인
    - 추상 클래스는 일반 클래스와는 달리 단독으로 객체를 생성할 수 없다.
      반드시 추상 클래스를 상속한 실제 클래스를 통해서만 객체를 생성할 수 있다.
*/

// 인터페이스와 추상 클래스와의 차이
/*
    - Java 8~ 인터페이스에 default 메소드가 추가되어 추상클래스와의 차이점이 모호해짐
    - 추상클래스는 인터페이스와는 달리 일반 클래스처럼 객체 변수, 생성자, private 메소드를 가질 수 있음
      * private 메소드는 클래스 내에서만 사용되는 메소드로 다른 클래스에서는 호출이 불가능
*/


abstract class Predator3 extends Animal6 {
                              // Animal6의 클래스 기능 유지하기 위해 상속
    abstract String getFood();  // 인터페이스의 메소드와 같은 역할을 하는 메소드 (getFood()) 앞에 abstract 붙여야함
                                // 몸통이 없음. 즉, abstract를 상속하는 클래스에서 해당 abstract 메소드 구현 필요

    // default  // default 메소드 사용 불가능 -> 제거
        void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    static int LEG_COUNT = 4;  // 추상 클래스의 상수는 static 선언 필요
                               // 명시적으로 static이라고 적어줘야 함

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable3 {
    void bark();
}

/*
    - 추상 클래스를 사용함으로서 사용 불가능 -> 삭제
      interface BarkablePredator3 extends Predator3, Barkable3 {
      }
*/

class Animal6 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Fox extends Predator3 implements Barkable3 {  // 추상 클래스를 상속하도록 변경
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Wolf extends Predator3 implements Barkable3 {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper3 {
    void feed(Predator3 predator3) {
        System.out.println("feed " + predator3.getFood());
    }
}

class Bouncer3 {
    void barkAnimal(Barkable3 animal) {
        animal.bark();
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        Bouncer3 bouncer3 = new Bouncer3();
        bouncer3.barkAnimal(fox);
        bouncer3.barkAnimal(wolf);
    }
}


