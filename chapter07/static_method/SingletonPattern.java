package chapter07.static_method;

class Sigleton {
    private Singleton() {
    }
}


public class SigletonPattern {
    public static void main(String[] args) {

        // Singleton (단 하나만의 객체를 생성하도록 강제하는 패턴)
        // 즉, 클래스를 통해 생성할 수 있는 객체는 하나만 되도록 만듬
        Singleton singleton = new Singleton(); // 컴파일 오류
    }
}
