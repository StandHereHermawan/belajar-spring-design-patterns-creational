package ariefbelajarteknologi.spring.creational.factory.method.impl;

import ariefbelajarteknologi.spring.creational.factory.method.SocialMedia;
import ariefbelajarteknologi.spring.creational.factory.method.SocialMediaType;
import lombok.Getter;

public class Discord implements SocialMedia {

    @Getter
    private final String name = "DISCORD";

    @Getter
    private final String link = "https://discord.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.DISCORD;
}
