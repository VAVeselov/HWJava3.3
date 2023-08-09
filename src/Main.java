public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double result = (int) service.calculate(24, 1_000_000, 9.99);

        System.out.println(result);
    }
}
