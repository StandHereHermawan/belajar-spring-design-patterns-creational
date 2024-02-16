package ariefbelajarteknologi.spring.creational.abstracts.factory.dana;

import ariefbelajarteknologi.spring.creational.abstracts.factory.ChargePaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class DanaPaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return 1000L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.DANA;
    }
}
