package chapter05.object;


// Class (객체를 생성하게 해줌)


    class Animal { // 클래스
        String name; // 객체 변수

        public void setName(String name) {  // 메소드
            this.name = name;
         // this = cat 객체에 setName 메소드 호출 -> this(cat)
         // 즉, cat.name = "boby";
        }
    }


    public class Object_Oriented2 {
        public static void main(String[] args) {

            Animal cat = new Animal();  // new -> 객체 생성 키워드 ("cat"은 "Animal"의 인스턴스이다.)
                System.out.println(cat.name); // 객체 변수 (Instance variable)
                                              // 도트(.) 연산자 사용하여 접근 (ex/ 객체.객체변수, cat.name)
                                              // name을 선언했으나 값이 없어 null 출력됨

            cat.setName("boby"); // 메소드 호출
                                 // 도트(.) 연산자 사용하여 호출 (ex/ 객체.메소드, cat.setName)
                System.out.println(cat.name); // boby

            Animal dog = new Animal();
            dog.setName("happy");
                System.out.println(dog.name); // happy
                                              // 객체 변수는 공유되지 않는다. (독립적이다)

        }
    }


