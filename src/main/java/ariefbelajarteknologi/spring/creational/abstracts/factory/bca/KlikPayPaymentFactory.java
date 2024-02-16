package ariefbelajarteknologi.spring.creational.abstracts.factory.bca;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.ChargePaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KlikPayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new KlikPayPaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new KlikPayCancelRequest();
    }

    @Override
    public GetBalanceRequest createGetBalanceRequest() {
        return new KlikPayGetBalanceRequest();
    }
}
