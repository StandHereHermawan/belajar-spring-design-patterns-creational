package ariefbelajarteknologi.spring.creational.abstracts.factory;

public interface PaymentFactory {

    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalanceRequest createGetBalanceRequest();
}
