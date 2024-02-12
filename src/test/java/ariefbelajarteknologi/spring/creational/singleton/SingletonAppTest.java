package ariefbelajarteknologi.spring.creational.singleton;

import ariefbelajarteknologi.spring.creational.util.Async;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SingletonApp.class)
class SingletonAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSingleton() {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());
    }

    @Test
    void raceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        Async.incrementCounter(counter1, 1000 * 1000);
        Async.incrementCounter(counter2, 1000 * 1000);
        Async.incrementCounter(counter3, 1000 * 1000);

        Thread.sleep(5000);

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());
    }
}