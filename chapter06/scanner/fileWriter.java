package chapter06.scanner;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class fileWriter {
    public static void main(String[] args) throws IOException {

        // FileWriter (String)

            FileWriter fw = new FileWriter("c:/out.txt");

            for(int i=1; i<11; i++) {
                String data = i + " 번 째 줄입니다.\r\n";
                fw.write(data);
            }

            fw.close();


        // 파일에 내용 추가하기 (FileWriter 사용)

            FileWriter fw2 = new FileWriter("c:/out.txt", true);
                                                                // 파라미터 (+)
                                                                // boolean 타입 (true -> 추가, false -> 추가 X)
                                                                // 기존의 내용을 덮어쓰지 않고 이후부터 파일이 쓰여짐
            for(int i=11; i<21; i++) {
                String data = i + "번 째 줄입니다.\r\n";
                fw2.write(data);
            }

            fw2.close();


        // 파일에 내용 추가하기 (PrintWriter 사용)

            PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
                               // PrintWriter 사용 시 파일명 대신 추가모드로 열린 FileWriter의 객체를 전달해야함
            for(int i=11; i<21; i++) {
                String data = i + " 번 째 줄입니다.";
                pw2.println(data);
            }

            pw2.close();
    }
}
