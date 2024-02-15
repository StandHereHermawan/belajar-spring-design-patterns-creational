package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class Tiktok implements SocialMedia {

    @Getter
    private final String name = "TIKTOK";

    @Getter
    private final String link = "https://tiktok.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.TIKTOK;

}
