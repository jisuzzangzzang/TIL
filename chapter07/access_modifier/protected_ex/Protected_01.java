package chapter07.access_modifier.protectedex; // 패키지가 서로 다르다.

import chapter07.access_modifier.Protected;

public class Protected_01 extends Protected { // Protected를 상속했다.
    public static void main(String[] args) {
        Protected_01 ptd = new Protected_01();
        System.out.println(ptd.lastname);   // 상속한 클래스의 protected 변수는 접근 가능
                                            // "kang" 출력
                                            // 만약 접근 제어자가 protected 가 아닌 default 였다면 컴파일 오류 발생
    }


}
