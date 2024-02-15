package ariefbelajarteknologi.spring.creational.factory.method.inheritance;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryMethodApp.class)
class InheritanceFactoryMethodAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {
        SocialMedia x = applicationContext.getBean("socialMediaX", SocialMedia.class);
        SocialMedia discord = applicationContext.getBean("socialMediaDiscord", SocialMedia.class);
        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
        SocialMedia facebookWeb = applicationContext.getBean("socialMediaFacebookWeb", SocialMedia.class);

        System.out.println(x);
        System.out.println(discord);
        System.out.println(facebook);
        System.out.println(facebookWeb);
    }
}