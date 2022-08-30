package chapter03.data;

import java.util.*;

public class Map {
    public static void main(String[] args) {


        // HashMap (제네릭스), put
            HashMap<String, String> map = new HashMap<>(); // key와 value 모두 String 타입
            map.put("people", "사람");
            map.put("baseball", "야구");


        // get
            System.out.println(map.get("people"));  // "사람" 출력
            System.out.println(map.get("java"));    // "null" 출력
            System.out.println(map.getOrDefault("java", "자바")); // null 대신 "자바" 출력


        // ContainsKey (Key를 조사하여 결과값을 리턴)
            System.out.println(map.containsKey("people"));  // true 출력


        // remove (Map의 항목 삭제, Key값에 해당되는 아이템을 삭제 후 value 리턴)
            System.out.println(map.remove("people"));   // "사람" 출력
            System.out.println(map.get("people"));  // remove 됬으므로 null 출력


        // size
            System.out.println(map.size()); // "people" 항목 삭제 됬으므로 1이 출력됨(=baseball)


        // KeySet (Map의 모든 Key를 리턴)
            HashMap<String, String> map2 = new HashMap<>();
            map2.put("people", "사람");
            map2.put("baseball", "야구");
                    System.out.println(map2.keySet());   // [baseball, people]


        // KeySet()의 List 자료형 변환
            List<String> KeyList = new ArrayList<>(map2.keySet());


        // LinkedHashMap (입력된 순서대로 데이터를 저장)
            LinkedHashMap<String, String> map3 = new LinkedHashMap<>();
            map3.put("flower", "꽃");
            map3.put("sea", "바다");
                    System.out.println(map3.keySet());  // [flower, sea]


        // TreeMap (입력된 Key의 오름차순 순서로 데이터를 저장)
            TreeMap<String, String> fruits = new TreeMap<>();
            fruits.put("grape", "포도");
            fruits.put("apple", "사과");
            fruits.put("banana", "바나나");
                    System.out.println(fruits.keySet()); // [apple, banana, grape]


    }
}


