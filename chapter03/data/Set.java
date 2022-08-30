package chapter03.data;

import java.util.*;

public class Set {
        public static void main(String[] args) {


                // HashSet (중복 허용X, 순서X, 중복을 제거하기 위한 필터 역할로 종종 사용)
                HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
                        System.out.println(set);    // [e, H, l, o] 출력


                // retainAll (교집합)
                HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
                HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

                HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
                intersection.retainAll(s2); // 교집합 수행
                        System.out.println(intersection); // [4, 5, 6] 출력


                // addAll (합집합)
                HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
                union.addAll(s2); // 합집합 수행
                        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력


                // removeAll (차집합)
                HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
                substract.removeAll(s2); // 차집합 수행
                        System.out.println(substract);  // [1, 2, 3]


                // add
                HashSet<String> set2 = new HashSet<>();
                set2.add("Jump");
                set2.add("To");
                set2.add("Java");
                        System.out.println(set2);   // [Java, To, Jump]


                // addAll (값 여러개 추가)
                set2.addAll(Arrays.asList("is", "fun"));
                        System.out.println(set2);   // [Java, is, To, Jump, fun] 출력 (순서 X)


                // TreeSet (오름차순으로 값을 정렬하여 저장)
                TreeSet<Integer> ts = new TreeSet<>();
                ts.addAll(Arrays.asList(8, 1, 2, 3, 4, 5, 6));
                        System.out.println(ts); // [1, 2, 3, 4, 5, 6, 8]


                // LinkedHashSet (입력한 순서대로 값을 정렬하여 저장)
                LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
                lhs.addAll(Arrays.asList(9, 1, 2, 3, 1, 0, 0, 4));
                        System.out.println(lhs); // [9, 1, 2, 3, 0, 4]
        }
}


