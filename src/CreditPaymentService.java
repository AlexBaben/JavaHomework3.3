public class CreditPaymentService {
    public int calculate(int amount, int years) {
        double percent = 0.0999 / 12;
        double result;
        result = amount * (percent * Math.pow(1 + percent, 12 * years) / (Math.pow(1 + percent, 12 * years) - 1));
        return (int) result;
    }

}
