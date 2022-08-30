package chapter06.scanner;
import java.io.IOException;
import java.io.InputStream;

public class inputStreamReader {
    public static void main(String[] args) throws IOException {


        // InputStreamReader (character)
            InputStream in = System.in; // InputStreamReader 객체 생성을 위한 InputStream 객체 필요
            java.io.InputStreamReader reader = new java.io.InputStreamReader(in);
            char[] a = new char[3]; // 문자를 받아와야하므로 char 배열 사용
            reader.read(a);

                System.out.println(a); // 콘솔에 "abc" -> "abc" 출력
                                       // 많은 문자열을 입력해도 앞의 3자리 문자열만 출력된다. (고정되어있음)


    }
}
