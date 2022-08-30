package chapter06.scanner.src;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) throws IOException {

        // 파일 읽기 (FileInputStream) - byte 단위
            byte[] b = new byte[1024];
            FileInputStream input = new FileInputStream("c:/out.txt");
            input.read(b);
            System.out.println(new String(b)); // byte 배열을 문자열로 변경하여 출력
            input.close();

        // 파일 읽기 (BufferReader) - Line 단위
            BufferedReader br = new BufferedReader(new FileReader("c/out.txt"));
            while(true) {
                String line = br.readLine();
                if(line==null)
                    break;  // 더 이상 읽을 라인이 없을 경우 while문을 빠져나감
                System.out.println(line);
            }

            br.close();

    }
}
