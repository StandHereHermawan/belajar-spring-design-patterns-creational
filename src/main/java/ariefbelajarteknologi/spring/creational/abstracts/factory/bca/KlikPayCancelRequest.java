package ariefbelajarteknologi.spring.creational.abstracts.factory.bca;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class KlikPayCancelRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;


    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
