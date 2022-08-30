package chapter03.data;

public class Enum {


    // Enum
    // (상수값을 사용할 때보다 코드가 명확해짐, 잘못된 값을 사용해서 발생할 수 있는 위험 사라짐)
        enum CoffeeType {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };

        public static void main(String[] args) {
            System.out.println(CoffeeType.AMERICANO);
            System.out.println(CoffeeType.ICE_AMERICANO);
            System.out.println(CoffeeType.CAFE_LATTE);

            for(CoffeeType type: CoffeeType.values()) {
                System.out.println(type);


        }
    }
}


