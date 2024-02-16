package ariefbelajarteknologi.spring.creational.abstracts.factory.creditcard;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardCancelRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;


    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
