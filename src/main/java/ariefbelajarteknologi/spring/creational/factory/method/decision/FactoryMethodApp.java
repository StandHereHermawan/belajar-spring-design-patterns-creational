package ariefbelajarteknologi.spring.creational.factory.method.decision;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import ariefbelajarteknologi.spring.creational.factory.method.impl.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApp {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {
        switch (type) {
            case FACEBOOK -> {
                return new FacebookWeb();
            }
            case DISCORD -> {
                return new Discord();
            }
            case TIKTOK -> {
                return new Tiktok();
            }
            case X -> {
                return new X();
            }
            case INSTAGRAM -> {
                return new Instagram();
            }
            case YOUTUBE -> {
                return new Youtube();
            }
            case STEAM -> {
                return new Steam();
            }
            default -> {
                throw new IllegalStateException("Unsupported Social Media: " + type);
            }
        }
    }
}
