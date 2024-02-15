package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class Youtube implements SocialMedia {

    @Getter
    private final String name = "YOUTUBE";

    @Getter
    private final String link = "https://youtube.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.YOUTUBE;
}
