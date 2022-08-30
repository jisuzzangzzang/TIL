

// Q7. 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드 수정


    interface Mineral { // Mineral interface 생성
        int getValue(); // 광물의 가치를 리턴하는 getValue 메소드 선언
    }

    class Gold implements Mineral { // 인터페이스를 상속받음
        public int getValue() {
            return 100;             // 금인 경우 100을 리턴
        }
    }

    class Silver implements Mineral {
        public int getValue() {
            return 90;             // 은인 경우 90을 리턴
        }
    }

    class Bronze implements Mineral {
        public int getValue() {
            return 80;             // 구리인 경우 80을 리턴
        }
    }

    class MineralCalculator {
        int value = 0;

        public void add (Mineral mineral) { // 모든 광물을 오버로딩하지 않고 Mineral 객체만 처리하도록 수정
            this.value += mineral.getValue();
        }

        public int getValue() {
            return this.value;
        }
    }


    public class Example05_02 {
        public static void main(String[] args) {
            MineralCalculator cal = new MineralCalculator();
            cal.add(new Gold());
            cal.add(new Silver());
            cal.add(new Bronze());
                System.out.println(cal.getValue()); // 270


        }
    }


