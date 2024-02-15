package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class Steam implements SocialMedia {

    @Getter
    private final String name = "STEAM";

    @Getter
    private final String link = "https://steam.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.STEAM;
}
