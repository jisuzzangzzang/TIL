package chapter06.scanner.src;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {


        // FileOutputStream (byte 단위의 데이터 처리)

        FileOutputStream output = new FileOutputStream("c:/out.txt"); // 파일 생성

        for(int i=1; i<11; i++) {
            String data = i+" 번 째 줄입니다.\r\n";
            output.write(data.getBytes());
        }

        output.close(); // 사용한 파일 객체 닫아줌
                        // 생략 가능 -> 자바 프로그램이 종료할 때 사용한 파일 객체를 자동으로 닫아주기 때문
                        // 하지만 직접 사용한 파일을 닫아주는 것이 좋음 (다시 사용 시 오류 발생)
    }
}
