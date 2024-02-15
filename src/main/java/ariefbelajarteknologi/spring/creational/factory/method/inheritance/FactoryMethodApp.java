package ariefbelajarteknologi.spring.creational.factory.method.inheritance;

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
    public SocialMedia socialMediaFacebookWeb() {
        return new FacebookWeb();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return new Facebook();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaX() {
        return new X();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaDiscord() {
        return new Facebook();
    }
}
