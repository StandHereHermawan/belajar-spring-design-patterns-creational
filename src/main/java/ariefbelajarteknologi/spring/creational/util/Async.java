package ariefbelajarteknologi.spring.creational.util;

import ariefbelajarteknologi.spring.creational.singleton.Counter;

public class Async {
    public static void incrementCounter(Counter counter, int total){
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();
    }
}
