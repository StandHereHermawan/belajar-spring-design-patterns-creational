package ariefbelajarteknologi.spring.creational.abstracts.factory.bca;

import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class KlikPayGetBalanceRequest implements GetBalanceRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
