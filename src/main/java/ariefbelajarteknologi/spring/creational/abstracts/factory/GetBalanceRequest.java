package ariefbelajarteknologi.spring.creational.abstracts.factory;

public interface GetBalanceRequest {

    String getUserId();

    void setUserId(String userId);

    PaymentMethod getMethod();
}
