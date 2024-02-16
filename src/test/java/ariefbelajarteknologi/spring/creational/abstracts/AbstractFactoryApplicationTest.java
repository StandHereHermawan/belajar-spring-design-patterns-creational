package ariefbelajarteknologi.spring.creational.abstracts;

import ariefbelajarteknologi.spring.creational.abstracts.factory.CancelPaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.ChargePaymentRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.GetBalanceRequest;
import ariefbelajarteknologi.spring.creational.abstracts.factory.PaymentFactory;
import ariefbelajarteknologi.spring.creational.abstracts.factory.bca.KlikPayPaymentFactory;
import ariefbelajarteknologi.spring.creational.abstracts.factory.creditcard.CreditCardPaymentFactory;
import ariefbelajarteknologi.spring.creational.abstracts.factory.dana.DanaPaymentFactory;
import ariefbelajarteknologi.spring.creational.abstracts.factory.gopay.GopayPaymentFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    class Operations{
        public static void charge(PaymentFactory paymentFactory){
            ChargePaymentRequest request = paymentFactory.createChargeRequest();
            request.setId("XXX-XXX");
            request.setAmount(1_000_000L);

            // Kirim ke Payment Gateway
            System.out.println(request);
        }

        public static void cancel(PaymentFactory paymentFactory){
            CancelPaymentRequest request = paymentFactory.createCancelRequest();
            request.setId("XXX-XXX");

            // Kirim ke Payment Gateway
            System.out.println(request);
        }

        public static Long getBalance(PaymentFactory paymentFactory){
            try {
                GetBalanceRequest request = paymentFactory.createGetBalanceRequest();
                request.setUserId("XXX-XXX-XXX");

                // send to payment gateway
                System.out.println(request);
                return 1000L;
            } catch (UnsupportedOperationException e) {
                return 0L;
            }
        }
    }

    @Test
    void testAbstractFactory() {
        CreditCardPaymentFactory creditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        KlikPayPaymentFactory klikPay = applicationContext.getBean(KlikPayPaymentFactory.class);
        GopayPaymentFactory gopay = applicationContext.getBean(GopayPaymentFactory.class);
        DanaPaymentFactory danaPayment = applicationContext.getBean(DanaPaymentFactory.class);

        Operations.charge(creditCard);
        Operations.charge(klikPay);
        Operations.charge(gopay);
        Operations.charge(danaPayment);
    }
}