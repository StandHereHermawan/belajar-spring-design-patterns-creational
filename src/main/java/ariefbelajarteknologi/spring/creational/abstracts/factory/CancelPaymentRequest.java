package ariefbelajarteknologi.spring.creational.abstracts.factory;

public interface CancelPaymentRequest {

    String getId();

    void setId(String id);

    PaymentMethod getMethod();
}
