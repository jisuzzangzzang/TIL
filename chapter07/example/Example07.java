package chapter07.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {


        // Q2. 다음 코드의 실행 결과를 예측하고, 이유에 대해 설명
                int result = 0;
                try {
                    int[] a = { 1, 2, 3 };
                    int b = a[3];   // ArrayIndexOutOfBoundsException
                    ArrayList c = new ArrayList(Arrays.asList("3")); // 문자값을 갖고 있는 c 리스트
                    int d = (int) c.get(0); // ClassCastException
                    int e = 4 / 0; // ArithmeticException
                } catch (ClassCastException e) {
                    result += 1;
                } catch (ArithmeticException e) {
                    result += 2;
                } catch (ArrayIndexOutOfBoundsException e) { // 가장 먼저 발생되는 예외
                    result += 3;                             // 3이 출력됨
                } finally {                                  // 예외에 상관없이 무조건 수행됨
                    result += 4;                             // 4가 더해짐
                }
                System.out.println(result); // 7
            }
        }