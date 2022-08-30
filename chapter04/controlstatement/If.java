import java.util.ArrayList;

public class If {
    public static void main(String[] args) {


        // if (조건문) 참이면 조건문 수행, 거짓이면 else 문에 속한 문장 수행
/*
            if (조건문) {
                <수행할 문장1>;
                <수행할 문장2>;
            } else {
                <수행할 문장A>;
                <수행할 문장B>;
            }
*/


        // 연산자
            int x = 3; int y = 2;
                System.out.println(x > y); // true
                System.out.println(y < x); // false
                System.out.println(x == y); // false
                System.out.println(x != y); // true


        // Q1. 3000원의 이상의 돈을 가지고 있으면 택시, 아니면 걸어가라
            int money = 2000;

            if (money >= 3000) {
                System.out.println("택시타기");
            } else {
                System.out.println("걸어가기");    // 조건문이 거짓이므로 else문 수행
            }


        // x || y (or), x와 y 둘 중 하나가 true면 true
        // x && y (and), x와 y 모두가 true면 true
        // !x (not), x가 거짓이면 true


        // contains (해당 아이템 조사)
            boolean card = true;
            ArrayList<String> pocket = new ArrayList<>();
            pocket.add("paper");
            pocket.add("handphone");

            if (pocket.contains("handphone")) { // pocket 안에 handphone이 있으므로 조건문 수행
                System.out.println("택시타기");
            } else {
                System.out.println("걸어가기");
            }


        // else if (다중 조건 판단)
/*
            if (조건문) {
                <수행할 문장1>
                <수행할 문장2>
                ...
            } else if (조건문) {
                <수행할 문장1>
                <수행할 문장2>
                ...
            } else if (조건문) {
                <수행할 문장1>
                <수행할 문장2>
                ...
                ...
            } else {
               <수행할 문장1>
               <수행할 문장2>
               ...
           }
*/


            if (pocket.contains("money")) { // 조건문이 거짓이므로 2번째 else if문으로 넘어감
                System.out.println("택시타기");
            } else if (card) {              // card = true 이므로 2번째 else if문 수행
                System.out.println("버스타기");
            } else {
                System.out.println("걸어가기");
            }
    }
}


