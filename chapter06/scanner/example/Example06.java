package chapter06.scanner;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {


        // Q1. 두개의 숫자를 입력받아 그 합을 출력하는 프로그램 작성
            Scanner scanner = new Scanner(System.in);
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int first = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int second = scanner.nextInt();

            int result = first + second;
                System.out.printf("%d + %d = %d 입니다.%n", first, second, result);


        // Q2. 영문 입력 후 엔터 -> 입력한 영문을 대문자로 변경하여 출력해주는 프로그램 작성
        //     단, 사용자가 "END"라는 문자열을 입력하기 전까지는 반복해서 문장을 입력받을 수 있게 할 것
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("영어 문장을 입력하세요: ");
                String line = sc.nextLine();
                if ("END".equals(line)) {   // 사용자 입력 문장이 "END"이면
                    break;                  // 프로그램을 중지한다.
                }
                System.out.println(line.toUpperCase()); // toUpperCase() -> 입력값을 대문자로 변경함
            }

    }
}