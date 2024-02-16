package ariefbelajarteknologi.spring.creational.abstracts.factory.creditcard;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.ChargePaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardPaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelRequest();
    }

    @Override
    public GetBalanceRequest createGetBalanceRequest() {
        throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
    }
}
