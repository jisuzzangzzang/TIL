package chapter07.accessmodifier;

public class Private {

    // 접근 제어자 (private, default, protected, public)

    // private (private가 붙은 변수, 메소드는 해당 클래스에서만 접근 가능)
        private String secret;
        private String getSecret() {
            return this.secret;
        }
    }
