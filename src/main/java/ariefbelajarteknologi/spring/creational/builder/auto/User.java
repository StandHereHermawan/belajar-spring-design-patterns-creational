package ariefbelajarteknologi.spring.creational.builder.auto;

import lombok.Builder;

@Builder
public class User {

    private String id;

    private String name;

    private Long cash;

    private UserType userType;

    public User(String id, String name, Long cash, UserType userType) {
        this.id = id;
        this.name = name;
        this.cash = cash;
        this.userType = userType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCash() {
        return cash;
    }

    public void setCash(Long cash) {
        this.cash = cash;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                ", userType=" + userType +
                '}';
    }
}
