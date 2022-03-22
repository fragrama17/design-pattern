package pattern.creational.singleton.naive;

import java.util.Random;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        for (int i = 0; i < 100000; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance(String.valueOf(new Random().nextInt(100)));
                System.out.println(singleton.value);
            }).start();
        }

    }
}