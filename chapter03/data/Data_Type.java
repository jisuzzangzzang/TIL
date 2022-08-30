package chapter03.data;

public class Data_Type {
    public static void main(String[] args) {


        // int (정수)
            int age = 10;


        // long
            long countOfStar = 8764827384923849L; // 대문자 'L' 붙여주기


        // float (실수)
            float pi = 3.14F; // 대문자 'F' 붙여주기


        // double
            double morePi = 3.14159265358979323846;
            double d1 = 123.4;
            double d2 = 1.234e2; // e2 = 10의 제곱


        // boolean (True / false)
            int base = 180;
            int height = 185;
            boolean isTall = height < base;

            if(isTall) {
                System.out.println("키가 큽니다.");
            } else {
                System.out.println("키가 작습니다."); // 키가 작습니다.가 출력됌
            }

            int i = 3;
            boolean isOdd = i % 2 == 1;
                    System.out.println(isOdd);  // true


        // 나머지 연산자 (%)
            System.out.println(7 % 3);  // 1 출력
            System.out.println(3 % 7);  // 3 출력
            System.out.println("-----");


        // 증감 연산자 (++, --)
            int a = 0; int b  = 10;
            a++;
            b--;


            System.out.println(a);  // 1
            System.out.println(b);  // 9


            int c = 0;
            System.out.println(c++); // 0, 값이 참조된 후에 증가 (코드 실행되는 순간에는 값이 변경되지 않음)
            System.out.println(c);  // 1


            int d = 0;
            System.out.println(++d); // 1, 값이 참조되기 전에 증가
            System.out.println(d);  // 1
            System.out.println("-----");


        // char (한개의 문자 값에 대한 자료형)
            char a1 = 'a';
            char a2 = 97;
            char a3 = '\u0061'; // 유니코드

            System.out.println(a1); // a
            System.out.println(a2); // a
            System.out.println(a3); // a
            System.out.println("-----");


        // String (문자열)
            String aa = new String("Happy java"); // 객체 생성
            String bb = new String("a");
            String cc = new String("123");
            String dd = "happy java"; // 리터럴 표기(가독성 좋음, 컴파일 시 최적화에 도움 줌)


        // primitive 자료형 (객체 생성 불가능) = int, long, double, float, boolean, char
        // Wrapper 클래스 (객체 생성 가능, 멀티 스레딩 동기화 가능) = Integer, Long, Double, Float, Boolean, Char
        // ArrayList, HashMap, HashSet = Wrapper 클래스 사용


        // equals
            String aaa = "hello";
            String bbb = new String("hello");
            System.out.println(aaa.equals(bbb)); // true
            System.out.println(aaa == bbb); // 동일한 객체가 아니기 때문에 false


        // indexOf (특정 문자가 시작되는 위치(인덱스) 리턴)
            String b1 = "Hello java";
            System.out.println(b1.indexOf("java")); // 0부터 숫자를 세므로 6 출력


        // Contains (특정 문자열이 포함되어 있는지의 여부)
            System.out.println(b1.contains("Java")); // false (대/소문자 구분)


        // CharAt (문자열에서 특정 위치의 문자를 리턴)
            System.out.println(b1.charAt(6)); // 0부터 숫자를 세므로 "j" 출력


        // replaceAll (문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용)
            System.out.println(b1.replaceAll("java", "World")); // Hello World 출력


        // substring (특정 문자를 뽑아낼 경우 사용)
            System.out.println(b1.substring(0, 4)); // Hell 출력


        // toUpperCase (문자열을 모두 대문자로 바꿔줌) <-> toLowerCase (문자열을 모두 소문자로)
            System.out.println(b1.toUpperCase()); // HELLO JAVA 출력


        // split (문자열을 특정 구분자로 분리)
            String c1 = "a:b:c:d";
            String[] result = c1.split(":");
                    System.out.println(result);  // result는 {"a", "b", "c", "d"}


        // 문자열 포매팅 (%d=숫자 / %s=문자)
            System.out.println(String.format("I eat %d apples.", 3));   // "I eat 3 apples" 출력
            System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples" 출력


        // 변수로 대입
            int num = 3;
            System.out.println(String.format("I eat %d apples.", num));   // "I eat 3 apples" 출력


        // 2개 이상의 값 넣기 (파라미터로 여러개 전달)
            int num2 = 10;
            String day = "three";
            // "I ate 10 apples. so I was sick for three days." 출력
            System.out.println(String.format("I ate %d apples. so I was sick for %s days", num2, day));


        // 문자열 포매팅 (%s)
            System.out.println(String.format("I have %s apples", 3));   // "I have 3 apples" 출력
            System.out.println(String.format("rate is %s", 3.234));     // "rate is 3.234" 출력


        // %d와 % 같이 쓰기
            System.out.println(String.format("Error is %d%%", 98));     // "Error is 98%." 출력


        // %10s = 전체 길이가 10개인 문자열 공간에서 오른쪽으로 정렬 후, 그 앞에는 공백 처리
            System.out.println(String.format("%10s", "hi"));    // "        hi" 출력


        // -%10s = 왼쪽으로 정렬 후, 나머지는 공백 처리
            System.out.println(String.format("%-10sjane", "hi"));   // "hi        jane." 출력


        // 소수점 표현하기
            System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
            System.out.println(String.format("%10.4f", 3.42134234));    // "    3.4213" 출력


        // System.out.printf (String.format 메소드 없이도 포매팅 문자열 출력)
            System.out.printf("I eat %d apples.", 3);   // "I eat 3 apples." 출력
            System.out.println();

 
        // append + StringBuffer (수정할 수 있는 값, String 자료형보다 무거움, 멀티 스레드 환경에서 안전)
            StringBuffer sb = new StringBuffer(); // StringBuffer 객체 sb 생성
            sb.append("Hello");
            sb.append(" ");
            sb.append("jump to java");  // append 메소드로 문자열 추가
            String rs = sb.toString();  // String 자료형으로 변경
                    System.out.println(rs); // "Hello jump to java"


        // String (변경할 수 없는 값)
            String result3 = "";
            result3 += "Hello";
            result3 += " ";
            result3 += "jump to java";
                    System.out.println(result3); // Hello jump to java


        // StringBuilder (StirngBuffer보다 성능 우수, 동기화를 고려할 필요가 없으면 유리함)
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hello");
            sb2.append(" ");
            sb2.append("jump to java");
            String result4 = sb2.toString();
                    System.out.println(result4); // Hello jump to java


        // insert (특정 위치에 원하는 문자열 삽입)
            StringBuffer sb3 = new StringBuffer();
            sb3.append("jump to java");
            sb3.insert(0, "Hello "); // 0번째 위치에서 "Hello" 문자열 삽입
                    System.out.println(sb3.toString());  // Hello jump to java


        // substring
            StringBuffer sb4 = new StringBuffer();
            sb4.append("Hello jump to java");
                    System.out.println(sb4.substring(0, 4)); // Hell 출력, substring(시작위치, 끝위치)


    }

}



