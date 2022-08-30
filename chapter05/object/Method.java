package chapter05.object;

// Method (메소드)


/*
    리턴자료형 메소드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
            ...
            return 리턴값;  // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
            }
*/


    public class Method {
        int sum (int a, int b) { // sum 메소드는 두개의 값(int a, int b)를 받아서
                                 // int a, int b -> 매개변수
                                 // parameter (매개변수) -> 메소드에 입력으로 전달된 값을 받는 변수
            return a+b; // 두 개의 입력 값을 더한 값(int)을 리턴해준다.
        }


    // 1. 일반적인 메소드 (입력 값과 리턴 값이 있는 메소드)
        int sum2 (int a2, int b2) { // 입력 값
            return a2+b2;   // 리턴 값
        }


    // 2. 입력값이 없는 메소드
        String say() {  // 입력 값 없음
            return "Hi"; // 리턴 값 (String)
        }


    // 3. 리턴 값이 없는 메소드
        void sum4 (int a, int b) { // 입력 값 (int a, int b)
            // 리턴 값 void (없음)
            System.out.println(a + "와 " + b + "의 합은 " +  (a+b) + " 입니다.");
        }


    // 4. 입력 값도 리턴 값도 없는 메소드
        void say5() {
            System.out.println("Hi");
        }


    // 5. return의 쓰임새
        void sayNick(String nick) { // 메소드의 리턴 값은 없다.
            if ("fool".equals(nick)){ // "fool"이라는 값이 들어오면
                return;               // return문에 의해 출력되지 않고 즉시 빠져나간다.
                                      // void 메소드에서만 사용 가능, 리턴자료형이 명시되있는 메소드에서는 컴파일 에러남
            }
            System.out.println("나의 별명은 " + nick + " 입니다.");
        }


    // 6. local variable (로컬 변수)
        void varTest(int d) { // 메소드 안에서만 효력을 발휘한다.
            d++;
        }


    // 7. 로컬 변수를 사용하고 싶지 않을 때
        int varTest2(int j) { // 입력으로 들어온 값을
            j++;              // 1만큼 증가시켜서
            return j;         // 리턴한다.
        }


    // 8. 객체를 넘기는 방법
        int z; // 객체 변수 z
        void varTest3(Method method) {
            method.z++;
        }


    // 9. this 활용하기
        int zz;

        void varTest4() {
            this.zz++;
        }



    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Method mtd = new Method();
        int c = mtd.sum(a, b);
     // int c = mtd.sum(3, 4) // 3, 4는 인수
     // arguments (인수) -> 메소드를 호출할 때 전달하는 입력 값

        System.out.println(c); // 7


        // 1. 일반적인 메소드 (입력 값과 리턴 값이 있는 메소드)
            Method mtd2 = new Method();
            int result = mtd.sum2(3, 4); // 입력 값이 int 타입이므로 int 자료형으로 호출해야함
/*
            - 입력 값 O, 리턴 값 O
              리턴값받을변수 = 객체.메소드명(입력인수1, 입력인수2, ...)
*/


        // 2. 입력값이 없는 메소드
            Method mtd3 = new Method();
            String s = mtd3.say();
            System.out.println(s);  // Hi
/*
            - 입력 값 X, 리턴 값 O
              리턴값받을변수 = 객체.메소드명()
*/


        // 3. 리턴 값이 없는 메소드
            Method mtd4 = new Method();
            mtd4.sum4(1, 2);
/*
            - 입력 값 O, 리턴 값 X
            객체.메소드명(입력인수1, 입력인수2, ...)
*/


        // 4. 입력 값도 리턴 값도 없는 메소드
            Method mtd5 = new Method();
            mtd5.say();
/*
            - 입력 값 X, 리턴 값 X
              객체.메소드명()
*/


        // 5. return (메소드를 빠져나가고 싶을 때, 단독으로 사용하여 즉시 빠져나갈 수 있음)
            Method mtd6 = new Method();
            mtd6.sayNick("angle");
            mtd6.sayNick("fool"); // return문에 의해 출력되지 않음


        // 6. local variable (로컬 변수)
            int d = 1;
            Method mtd7 = new Method();
            mtd7.varTest(d);
                System.out.println(d);


        // 7. 로컬 변수를 사용하고 싶지 않을 때
            int j = 1;
            Method mtd8 = new Method();
            mtd8.varTest2(j);
                System.out.println(j);


        // 8. 객체를 넘기는 방법
            Method mtd9 = new Method();
            mtd9.z = 1;
            mtd9.varTest3(mtd9);
                System.out.println(mtd9.z);


        // 9. this 활용하기
            Method mtd10 = new Method();
            mtd10.zz = 1;
            mtd10.varTest4();
                System.out.println(mtd10.zz);


    }
}


