package ariefbelajarteknologi.spring.creational.abstracts.factory.gopay;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.ChargePaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayPaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelRequest();
    }

    @Override
    public GetBalanceRequest createGetBalanceRequest() {
        return new GopayGetBalanceRequest();
    }
}
