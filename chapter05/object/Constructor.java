package chapter05.object;

class Animal3 {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal3 {
/*
    Cat() {
        // 디폴트 생성자 (입력 항몽X, 생성자 내부에 내용X)
    }
 */
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}


// 생성자 (Constructor)
/*

    1. 클래스명과 메소드명이 동일하다.
    2. 리턴 타입을 정의하지 않는다. (void도 사용 X)

*/

class HouseCat extends Cat {
    HouseCat(String name) { // 생성자
                            // 생성자 사용 시 setName("kong")과 같은 필수적인 행동을 객체 생성시에 제어할 수 있다.
                            // String 자료형을 입력받는 생성자
        this.setName(name);
    }

    HouseCat(int type) { // int 자료형을 입력 받는 생성자
                         // 입력 항목이 다른 생성자를 여러 개 만들 수 있음 (생성자 오버로딩)
        if (type == 1) {
            this.setName("KoreanShortHair");
        } else if (type == 2) {
            this.setName("AmericanShortHair");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}


public class Constructor {
    public static void main(String[] args) {

        /*
        HouseCat cat = new HouseCat("Kong"); // 생성자 호출 시 문자열(String name)을 전달해야한다.
        System.out.println(cat.name);   // cat객체 name 변수에 아무런 값이 없으므로 null 출력
        */

        HouseCat kong = new HouseCat("kong");   // 문자열로 생성
        HouseCat KoreanShortHair = new HouseCat(1); // 숫자 값으로 생성
            System.out.println(kong.name);
            System.out.println(KoreanShortHair.name);
    }
}


