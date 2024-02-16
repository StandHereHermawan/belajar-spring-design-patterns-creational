package ariefbelajarteknologi.spring.creational.abstracts.factory.dana;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.ChargePaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanaPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new DanaPaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new DanaCancelRequest();
    }

    @Override
    public GetBalanceRequest createGetBalanceRequest() {
        return new DanaGetBalanceRequest();
    }
}
