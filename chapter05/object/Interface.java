package chapter05.object;

// 인터페이스 (Interface)
/*
    - 육식 동물의 종류만큼 feed 메소드가 필요했던 ZooKeeper 클래스를 Predator 인터페이스를 이용하여 구현했더니,
      단 한개의 feed 메소드로 구현이 가능해짐

    - Zookeeper 클래스가 동물들의 종류에 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 됨

    - ex)
      컴퓨터 -> Zookeeper
      USB포트 -> Predator
      하드디스크, 디지털 카메라.. -> Tiger, Lion, Crocodile...
*/

// 상속과 인터페이스
/*
    - Animal 클래스에 getFood 메소드(+) -> Tiger, Lion 에서 getFood 메소드 오버라이딩
      -> Zookeeper의 feed 메소드가 predator 대신 Animal을 입력 자료형으로 사용해도 동일한 효과

    - 하지만 상속은 자식 클래스가 부모 클래스의 메소드를 오버라이딩하지 않고 사용할 수 있기 때문에
      해당 메소드를 반드시 구현해야한다는 "강제성"을 갖지 못함.

    - 상황에 맞게 상속 or 인터페이스를 사용해야할 지 결정해야겠지만
      인터페이스는 인터페이스의 메소드를 반드시 구현해야하는 "강제성"을 갖음.
*/


interface predator { // 육식동물 인터페이스(+)
                     // 단독 파일로 저장하는게 일반적이나, 편의를 위해 최상단에 작성함

    String getFood(); // 인터페이스의 메소드는 입출력에 대한 정의만 있고 내용은 없다.
                      // getFood 메소드는 implements한 클래스들이 구현해야한다.


    // 디폴트 메소드 (default method) Java 8~
/*
        default void printFood() {
            System.out.println("my food is %s\n", getFood());
        }
        - 오버라이딩 가능 (실제 클래스에서 다르게 구현하여 사용 가능)
        - Predator 인터페이스를 구현한 Tiger, Lion 등의 실제 클래스는 printFood 메소드를 구현하지 않아도 사용 가능
*/


    // 스태틱 메소드 (static method) java 8~
/*
        int LEG_COUNT = 4; // 인터페이스 상수
                              public static final을 생략해도 자동으로 적용됨
                              다른 형태의 상수 정의는 불가능

        static int speed() {
        return LEG_COUNT * 30;
        }

        -> Predator.speed();
           인터페이스명.스태틱메소드명
*/
}

class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal4 implements predator {
    public String getFood() { // 인터페이스의 메소드는 항상 public으로 구현해야함
        return "apple";
    }
}

class Lion extends Animal4 implements predator {
    public String getFood() {
        return "banana";
    }
}

/*
    - 육식동물이 추가될 때마다 Predator 인터페이스를 구현한 클래스만 작성하면 됨
        class Crocodile extends Animal implements Predator {
        }
*/

// 메소드 오버로딩(입력값(Tiger, Lion)이 다르지만 메소드 명(feed)은 동일하다)
class Zookeeper {
 /*

    void feed(Tiger tiger) {    // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed apple");
    }

    void feed(Lion lion) {      // 사자가 오면 바나나를 던져 준다.
        System.out.println("feed banana");
    }

*/

/*
    - 동물이 계속 추가된다면 매번 feed 메소드를 추가해줘야함 -> 인터페이스의 필요성

        public void feed(Crocodile crocodile) {
            System.out.println("feed strawberry");
        }

        public void feed(Leopard leopard) {
            System.out.println("feed orange");
        }
*/

    void feed(predator predator) {
        // System.out.println("feed apple"); -> 항상 feed apple만 출력하게됨
        System.out.println("feed " + predator.getFood());
                                  // predator.getFood() 호출 ->
                                  // Predator 인터페이스를 구현한 구현체(Tiger, Lion)의 getFood() 메소드 호출
    }
}


public class Interface {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
           // tiger = Tiger 클래스의 객체, Predator 인터페이스의 객체 (다형성)
        Lion lion = new Lion();
          // lion = Lion 클래스의 객체, Predator 인터페이스의 객체 (다형성)
          // 다형성(폴리모피즘) - 객체가 한 개 이상의 자료형 타입을 갖게되는 특성
        zookeeper.feed(tiger);  // feed apple
        zookeeper.feed(lion);   // feed banana
    }
}