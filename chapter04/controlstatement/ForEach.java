package chapter04.controlstatement;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {


        // for each문의 구조 (루프를 돌릴 수 있는 자료형 즉, 배열 및 ArrayList만 가능)
/*
        for (type var: iterate) {
            body-of-loop
        }
*/


        // for each
        String[] numbers = { "one", "two", "three" };
        for(String number:numbers) {
            System.out.println(number);
        }


        // 예제 (1)
        ArrayList<String> num = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for(String number:num) {
            System.out.println(num);
        }
    }
}



