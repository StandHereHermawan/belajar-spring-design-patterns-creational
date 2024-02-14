package ariefbelajarteknologi.spring.creational.builder;

import ariefbelajarteknologi.spring.creational.builder.auto.User;
import ariefbelajarteknologi.spring.creational.builder.auto.UserType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public User userVisitor(){
        return User.builder()
                .id("XXX-XXX-XXX-3")
                .userType(UserType.VISITOR)
                .build();
    }

    @Bean

    @Scope("prototype")
    public User userCustomer(){
        return User.builder()
                .id("XXX-XXX-XXX-2")
                .userType(UserType.CUSTOMER)
                .build();
    }

    @Bean
    @Scope("prototype")
    public User userLoyalCustomer(){
        return User.builder()
                .id("XXX-XXX-XXX-1")
                .userType(UserType.LOYAL_CUSTOMER)
                .build();
    }
}
