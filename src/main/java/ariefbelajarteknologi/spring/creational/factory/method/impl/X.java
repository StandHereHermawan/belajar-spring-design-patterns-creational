package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class X implements SocialMedia {

    @Getter
    private final String name = "X";

    @Getter
    private final String link = "https://x.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.X;
}
