package chapter03.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Example03 {
    public static void main(String[] args) {


        // Q1. 평균 점수 구하기
            int a = 80;
            int b = 75;
            int c = 55;
                System.out.println("홍길동씨의 평균 점수는 " + (a + b + c) / 3 + " 입니다."); // 70


        // Q2. 자연수 13이 홀수인지? 짝수인지?
            int d = 13;
            if (d % 2 == 0) {
                System.out.println("자연수 13은 짝수입니다.");
            } else {
                System.out.println("자연수 13은 홀수입니다.");
            }


        // Q3. 주민등록번호를 yyyyMMdd 와 그 뒤의 숫자 부분으로 나누어 출력하기
            String pin = "881120-1068234";

            String yyyyMMdd = pin.substring(0, 6);
            String num = pin.substring(7);
                System.out.println(yyyyMMdd); // 881120
                System.out.println(num); // 1068234


        // Q4. 성별을 나타내는 숫자 출력
            System.out.println(pin.charAt(7)); // 1


        // Q5. replace() 함수 사용
            String a1 = "a:b:c:d";
            String b1 = a1.replaceAll(":", "#");
                System.out.println(b1); // a#b#c#d


        // Q6. [1, 3, 5, 4, 2] -> [5, 4, 3, 2, 1]로
            ArrayList<Integer> myList = new ArrayList(Arrays.asList(1, 3, 5, 4, 2));
            myList.sort(Comparator.reverseOrder()); // 내림차순
                System.out.println(myList); // [5, 4, 3, 2, 1]


        // Q7. ['Life', 'is', 'too', 'short'] 리스트 -> Life is too short 문자열
            ArrayList<String> myList2 = new ArrayList(Arrays.asList("Life", "is", "too", "short"));
            String result = String.join(" ", myList2); // 단어들 사이 공백처리
                System.out.println(result); // "Life is too short" 출력


        // Q8. 맵 grade에서 "B" 값 추출 (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)
            HashMap<String, Integer> grade = new HashMap();
            grade.put("A", 90);
            grade.put("B", 80);
            grade.put("C", 70);

            int result2 = (Integer) grade.remove("B");
                System.out.println(result2); // 80
                System.out.println(grade); // {A=90, C=70}


        // Q9. 중복 숫자 제거하기
            ArrayList<Integer> numbers = new ArrayList(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5));
            HashSet<Integer> temp = new HashSet(numbers);
            ArrayList<Integer> result3 = new ArrayList(temp);
                System.out.println(result3); // [1, 2, 3, 4, 5]


        // Q10. 매직 넘버(상수)를 제거하여 프로그램 개선하기
/*
            enum CoffeeType {
                AMERICANO,
                ICE_AMERICANO,
                CAFE_LATTE,
            };

            static void printCoffeePrice (CoffeeType type){
                HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
                priceMap.put(CoffeeType.AMERICANO, 3000);
                priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
                priceMap.put(CoffeeType.CAFE_LATTE, 5000);

                int price = priceMap.get(type);
                System.out.println(String.format("가격은 %d원 입니다.", price));
            }

            public static void main (String[] args){
                printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
                printCoffeePrice(CoffeeType.ICE_AMERICANO);  // "가격은 4000원 입니다." 출력
                printCoffeePrice(CoffeeType.CAFE_LATTE);  // "가격은 5000원 입니다." 출력
*/


    }
}



