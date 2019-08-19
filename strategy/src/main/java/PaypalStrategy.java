/**
 * @ClassName PaypalStrategy
 * @Description TODO
 * @Author mingjie
 * @Date 2019-08-19 23:15
 * @Versrion 1.0
 **/
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
