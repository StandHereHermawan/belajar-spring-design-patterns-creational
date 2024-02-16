package ariefbelajarteknologi.spring.creational.abstracts.factory.dana;

import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class DanaGetBalanceRequest implements GetBalanceRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.DANA;
    }
}
