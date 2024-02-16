package ariefbelajarteknologi.spring.creational.abstracts.factory.gopay;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayCancelRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;


    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
