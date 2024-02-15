package ariefbelajarteknologi.spring.creational.factory;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import ariefbelajarteknologi.spring.creational.factory.method.decision.FactoryMethodApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryMethodApp.class)
class DecisionFactoryMethodAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        SocialMedia steam = applicationContext.getBean(SocialMedia.class, SocialMediaType.STEAM);
        SocialMedia x = applicationContext.getBean(SocialMedia.class, SocialMediaType.X);
        SocialMedia discord = applicationContext.getBean(SocialMedia.class, SocialMediaType.DISCORD);
        SocialMedia tiktok = applicationContext.getBean(SocialMedia.class, SocialMediaType.TIKTOK);
        SocialMedia youtube = applicationContext.getBean(SocialMedia.class, SocialMediaType.YOUTUBE);

        System.out.println(facebook);
        System.out.println(instagram);
        System.out.println(steam);
        System.out.println(x);
        System.out.println(discord);
        System.out.println(tiktok);
        System.out.println(youtube);
    }
}