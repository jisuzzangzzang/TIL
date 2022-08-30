package chapter06.scanner.src;

import java.io.IOException;
import java.io.InputStream;

public class inputStream {
    public static void main(String[] args) throws IOException {


        // InputStream (byte)
            // 스트림 (Stream) 이란?
/*
              - ex) 수도꼭지 -> A 수도관에서 B 수도관으로 이동하는 물의 흐름
              - 파일 데이터 (파일은 시작과 끝이 있는 데이터의 스트림)
                HTTP 송수신 데이터 (브라우저가 요청 -> 서버가 응답)
                키보드 입력 (키보드(입력) -> 문자열(스트림))
*/


            // InputStream의 read 메소드는 1 byte만 읽기 때문에 "abc"를 입력해도 "a"에 해당되는 숫자 97만 출력됨.
            // Q. 사용자가 3 byte를 입력 -> 3 byte 전부 읽고 싶다면?
/*
                int a;
                int b;
                int c;
                a = in.read();
                b = in.read();
                c = in.read();

                System.out.println(a);  // 97
                System.out.println(b);  // 98
                System.out.println(c);  // 99
*/


            // 좀 더 개선된 방법 (배열 사용)
                InputStream in = System.in; // System.in -> InputStream의 객체

                byte[] a = new byte[3];
                in.read(a);

                System.out.println(a[0]);
                System.out.println(a[1]);
                System.out.println(a[2]);


    }
}
