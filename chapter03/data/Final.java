package chapter03.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Final {
    public static void main(String[] args) {


        // 문자열 -> 정수 형변환 (Integer.parseInt())
            String num = "123";
            int a = Integer.parseInt(num);
                    System.out.println(a);  // 123


        // 정수 -> 문자열 형변환 (Integer.toString() || String.valueOf())
            String num2 = "" + a;   // 빈 문자열 더해주기
                    System.out.println(num2); // 123

            int b = 456;
            String num3 = String.valueOf(b);
            String num4 = Integer.toString(b);
                    System.out.println(num3); // 456
                    System.out.println(num4); // 456


        // 소수점의 숫자 -> 문자열 형변환 (Double.parseDouble() || Float.parseFloat())
            String num5 = "123.456";
            double d = Double.parseDouble(num5);
            Float f = Float.parseFloat(num5);
                    System.out.println(d); // 123.456
                    System.out.println(f); // 123.456


        // 정수와 실수 사이의 형변환
            int a1 = 123;
            double d1 = a1; // 정수를 실수로 바꿀 때 캐스팅 필요X
                    System.out.println(d1); // 123.0

            double d2 = 123.456;
            int a2 = (int) d2;  // 실수를 정수로 바꿀 때에는 반드시 정수형으로 캐스팅
                    System.out.println(a2); // 소숫점 생략된 123


/*
        // 실수형태의 문자열을 정수로 형변환시 -> NumberFormatException
        String number = "123.456";
        int aa = Integer.parseInt(number);
*/


        // final (값을 단 한번만 설정하는 강제 키워드, 값이 변하면 안되는 상황에 사용)
            final int n = 123;
            // n = 456; 컴파일 에러 발생

            final ArrayList<String> bb = new ArrayList<>(Arrays.asList("a", "b"));
            // bb = new ArrayList<>(Arrays.asList("c", "d")); 컴파일 에러 발생

            final List<String> cc = List.of("a", "b");
            // cc.add("c");  // UnsupportedOperationException 발생


        // Unmodifiable List (final로 선언한 리스트의 경우 add, remove 가능. 재할당만 불가능)
        // add, remove도 불가능하게 하고 싶은 경우 사용

            final ArrayList<String> dd = new ArrayList<>(Arrays.asList("하나", "둘"));
            dd.add("셋");
                    System.out.println(dd);


    }
}



