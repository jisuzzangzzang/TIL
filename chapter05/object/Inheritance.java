package chapter05.object;


// extends (상속)
    class Animal2 {
        String name;

        void setName(String name) {
            this.name = name;
        }
    }

    class Dog extends Animal2 {
           // extends = 상속 키워드 , Animal2 클래스 메소드 사용 가능
        void sleep() {  // 부모 클래스의 기능을 확장
            System.out.println(this.name + " zzz");
        }
    }


// 메소드 오버라이딩 (Method overriding)
    class HouseDog extends Dog {
        // Dog 클래스를 구체화 시키는 HouseDog 클래스 (메소드 오버라이딩)
        void sleep() {
            System.out.println(this.name + " zzz in house");
            // HouseDog sleep() > Dog sleep() 더 높은 우선 순위의 메소드가 호출됨
        }


// 메소드 오버로딩 (method overloading)
        void sleep(int hour) {
            // sleep이라는 동일한 이름의 메소드가 이미 있으나 입력 항목(int 자료형)이 다르다.
            // 입력 항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩이라 한다.
            System.out.println(this.name + " zzz in house for " + hour + " hours");
        }
    }


    public class Inheritance {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.setName("poppy");
                System.out.println(dog.name); // poppy
            dog.sleep(); // poppy zzz

            HouseDog houseDog = new HouseDog();
            houseDog.setName("happy");
                System.out.println(houseDog.name); // happy
            houseDog.sleep(); // happy zzz in house
            houseDog.sleep(3); // happy zzz in house for 3 hours
        }
    }


// IS-A 관계
/*

    Animal2 dog = new dog(); // dog is a Animal2
        // Dog 클래스에만 존재하는 sleep 메소드 사용 X, setName 메소드만 사용 가능

    Dog dog = new Animal2; // 컴파일 오류
        // 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.

*/


// Object 클래스 (자바에서 만드는 모든 클래스는 Object 클래스를 상속 받는다.)
/*

    class Animal2 extends Object {
        String name;

        void setName(String name) {
            this.name = name;
        }
    }

    Object animal2 = new Animal2(); // Animal is a Object
    Object dog = new Dog(); // Dog is a Object

*/


// 자바는 다중 상속을 지원하지 않는다. (다중 상속 지원 시 애매모호한 부분이 생기게 되므로 애초에 불명확한 부분을 잘라낸 언어임)


