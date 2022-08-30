package chapter03.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Array {
        public static void main(String[] args) {


        // 배열의 길이
            String[] weeks = { "월", "화", "수", "목", "금", "토", "일" };
            for (int i=0; i<weeks.length; i++) {
                System.out.print(weeks[i]);
                }
                System.out.println();


        // ArrayList , add
            ArrayList a = new ArrayList();
            a.add(0, "00");
            a.add(1, "11");
            a.add(2, "22");

            System.out.println(a.get(1)); // get: 특정 인덱스 값 추출, 11
            System.out.println(a.size()); // size: ArrayList의 갯수 리턴, 3
            System.out.println(a.contains("00")); // 결과를 boolean으로 리턴, true
            System.out.println(a.remove("11")); // 객체 항목 삭제 후 true or false 리턴, true
            System.out.println(a.remove(0)); // 인덱스 항목 삭제 후 삭제 항목 리턴 -> 00 출력


        // 제네릭스(Generics)
            ArrayList<String> aa = new ArrayList<>(); // ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다.


        // 제네릭스 사용 전
            ArrayList b = new ArrayList();
            b.add("1");
            b.add("2");

            String one = (String) b.get(0); // Object -> String 으로 캐스팅
            String two = (String) b.get(1);

            System.out.println(one);    // 1
            System.out.println(two);    // 2


        // 제네릭스 사용 후
            ArrayList<String> c = new ArrayList<>();
            c.add("3");
            c.add("4");
            c.add("5");
                System.out.println(c); // [3, 4, 5] 출력

            String three = c.get(0); // 형변환 필요X,
            String four = c.get(1);
                System.out.println(three);  // 3
                System.out.println(four);   // 4


        // 데이터가 존재하는 경우의 ArrayList
            Integer[] data = { 1, 2, 3 };
            ArrayList<Integer> num = new ArrayList<>(Arrays.asList(data));
                System.out.println(num); // [1, 2, 3]

            ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3));
                System.out.println(num2); // [1, 2, 3]


        // String.join (Java 8~)
            ArrayList<String> num3 = new ArrayList<>(Arrays.asList("하나", "둘", "셋"));
            String result = String.join(",", num3); // String.join("구분자", 리스트객체)
                System.out.println(result); // 하나, 둘, 셋

            String[] num4 = new String[] {"넷", "다섯", "여섯"};
            String result2 = String.join(",", num4);
                System.out.println(result2); // 넷, 다섯, 여섯


        // 리스트 정렬하기
            ArrayList<String> num5 = new ArrayList<>(Arrays.asList("111", "222", "333"));
            num5.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
            // num5.sort(Comparator.reversOrder()); // 내림차순으로 정렬
                System.out.println(num5); // [111, 222, 333]


        }
}


