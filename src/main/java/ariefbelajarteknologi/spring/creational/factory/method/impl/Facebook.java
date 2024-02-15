package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class Facebook implements SocialMedia {

    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final String link = "https://facebook.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.FACEBOOK;
}
