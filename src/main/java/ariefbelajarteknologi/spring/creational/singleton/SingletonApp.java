package ariefbelajarteknologi.spring.creational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApp {

    @Bean
    // Bean Annotation has Default Singleton Pattern
    public Counter counter(){
        return new Counter();
    }
}
