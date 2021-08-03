package src;

public class CreditPaymentService {
    public int calculate(int creditAmount, int periodYears, double percentPerYear) {
        int payPeriods = periodYears * 12;
        double percentPerMonth = percentPerYear/12/100;
        double annuitetCoefficient = 1/(1-Math.pow(1+percentPerMonth, -payPeriods));
        double monthlyPayment = creditAmount * percentPerMonth * annuitetCoefficient;
        
        return (int) monthlyPayment;
    }
}