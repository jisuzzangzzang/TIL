package chapter05.object;

/*
class Updater {
    void update(int count) { // 값을 그대로 전달 받음
        count++;
    }
}
 */


class Updater {
    void update(Counter counter) { // 객체를 전달 받음
        counter.count++;
    }
}

class Counter {
    int count = 0; // 객체 변수
}


public class CallByValue {
    public static void main(String[] args) {
        Counter myCounter = new Counter(); // 객체 생성
        System.out.println("before update: " + myCounter.count); // 0

/*
        Updater myUpdater = new Updater(); // 객체 생성
        System.out.println("after update: " + myCounter.count); // 0
 */

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update: " + myCounter.count); // 1
    }
}


