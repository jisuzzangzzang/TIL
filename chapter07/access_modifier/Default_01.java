package chapter07.accessmodifier; // 패키지가 동일하다

public class Default_01 {

    String lastname = "park";

    public static void main(String[] args) {
        Default kim = new Default();
        System.out.println(kim.lastname);
        // 패키지가 동일하므로, Default 클래스의 lastname 변수를 사용할 수 있다.
    }
}
