package chapter06.scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;

public class bufferedReader {
    public static void main(String[] args) throws IOException {

        // BufferedReader (String)

            InputStream in = System.in; // InputStreamReader 생성을 위한 객체
            InputStreamReader reader = new InputStreamReader(in); // BufferedReader 생성을 위한 객체
            BufferedReader br = new BufferedReader(reader);

                String a = br.readLine();
                System.out.println(a); // 콘솔에 Hello World -> Hello World 그대로 출력


    }
}
