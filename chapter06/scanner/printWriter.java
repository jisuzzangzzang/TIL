package chapter06.scanner;

import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) throws IOException {

        // PrintWriter
            PrintWriter pw = new PrintWriter("c:/out.txt");
            for(int i=1; i<11; i++) {
                String data = i + " 번 째 줄입니다.";
                pw.println(data); // 콘솔 대신 파일에 출력하는 방법
                                  // System.out 대신 PrintWriter 객체를 사용
        }

            pw.close();

    }
}
