package src;

public class Main {
    public static void main(String[] args){
        CreditPaymentService payment = new CreditPaymentService();
        System.out.println(payment.calculate(1_000_000, 1, 9.99));
        System.out.println(payment.calculate(1_000_000, 2, 9.99));
        System.out.println(payment.calculate(1_000_000, 3, 9.99));
    }
}