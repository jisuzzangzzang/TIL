package chapter06.scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example06_01 {
    public static void main(String[] args) throws IOException {


        // Q3. 예상한 "Write once, run anywhere"라는 문장 출력하지 않고 null을 출력함. null이 안나오게 수정하기

        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Write once, run anywhere");

        fw.close(); 

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line = br.readLine();
        System.out.println(line);

        br.close();
    }
}
