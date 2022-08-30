package chapter05.object;

// 다형성 (Polymorphism)
/*

    ex) IS-A 관계
    Cheetah cheetah = new Cheetah();  // Cheetah is a Cheetah
    Animal5 animal5 = new Cheetah();  // cheetah is a Animal5
    Predator2 predator2 = new Cheetah(); // Cheetah is a Predator2
              -> getFood() 메소드만 호출 가능
    Barkable barkable = new Cheetah(); // Cheetah is a Barkable
              -> bark() 메소드만 호출 가능

*/


interface Predator2 {
    String getFood();
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator2, Barkable {
    // 기존의 인터페이스를 상속하여 BarkablePredator 생성
    // 인터페이스는 일반 클래스와 달리 extends를 이용하여 여러개의 인터페이스(Predator2, Barkable)를 동시에 상속 가능 (다중 상속)
    // 일반클래스 -> 단일 상속만 가능
}

class Animal5 {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

class Cheetah extends Animal5 implements Predator2, Barkable {
    public String getFood() { // 인터페이스의 메소드는 항상 public으로 구현해야함
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Jaguar extends Animal5 implements BarkablePredator {
                          // implements 인터페이스1, 인터페이스2 ...
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class Zookeeper2 {
    void feed(Predator2 predator2) {
        System.out.println("feed " + predator2.getFood());

    }
}

class Bouncer {
    // 경비원 클래스(+)

    void barkAnimal(Barkable animal) {  // Animal 대신 Barkable 사용
        animal.bark();
    }

/*
    void barkAnimal(Animal5 animal5) {
        if (animal5 instanceof Cheetah) {
                 // animal5의 객체는 Cheetah 클래스로 만들어진 객체인가?
            System.out.println("어흥");
        } else if (animal5 instanceof Jaguar) {
            System.out.println("으르렁");

        - 동물 클래스가 추가 될 때마다.. -> 인터페이스 구현 필요
        } else if (animal instanceof Crocodile) {
            System.out.println("쩝쩝");
        } else if (animal instanceof Leopard) {
            System.out.println("캬옹");
        }
*/

    }


public class Polymorphism {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        Jaguar jaguar = new Jaguar();
        Bouncer bouncer = new Bouncer();

        bouncer.barkAnimal(cheetah);    // 어흥
        bouncer.barkAnimal(jaguar);     // 으르렁
    }
}


