package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class Instagram implements SocialMedia {

    @Getter
    private final String name = "INSTAGRAM";

    @Getter
    private final String link = "https://instagram.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;
}
