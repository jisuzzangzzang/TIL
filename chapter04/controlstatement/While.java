public class While {
    public static void main(String[] args) {


        // while (조건문이 참인 동안 while문의 반복 수행)
/*
            while (조건문) {
            <수행할 문장1>;
            <수행할 문장2>;
            <수행할 문장3>;
            ...
            }
*/


        // Q. 열 번 찍어 안 넘어 가는 나무 없다
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }


        // 무한 루프 (Loop)
/*
            while (true) {
                System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
            }
*/


        // while문 빠져나가기 (break)
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 지불했으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");

            if (coffee == 0) { // coffee가 0이 되면 if문 실행 -> break 호출 -> while문 빠져나감
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다");
                break;
            }
        }


        // while문 조건문으로 돌아가기 (continue)
        int a = 0;

        while (a < 10) {
            a++;
            if (a % 2 == 0) {   // 짝수인 경우 continue 수행 -> while문으로 돌아감
                continue;
            }
            System.out.println(a);
        }
    }
}



