package chapter06.scanner;

public class scanner {
    public static void main(String[] args) {


        java.util.Scanner sc = new java.util.Scanner(System.in); // 콘솔 입력인 System.in(InputStream)을 필요로 함
        System.out.println(sc.next());  // next() -> 단어 하나를 읽어들임

/*
        next() - 단어
        nextLine() - 라인
        nextInt() - 정수
*/

        // 콘솔 출력 (System.out과 System.err)
            System.out.println("일반 출력");    // 콘솔에 값을 출력할 때, 디버깅 시 많이 사용
            System.err.println("에러 출력");    // 오류 메세지를 출력할 경우 사용


    }
}
