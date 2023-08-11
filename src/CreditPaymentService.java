public class CreditPaymentService {
    public double calculate(double month, double sum, double persent) {
        double persentInMonth = persent / 12 / 100;
        double annuitRatio = (persentInMonth * Math.pow((1 + persentInMonth), month)) / (Math.pow((1 + persentInMonth), month) - 1);
        double paiment = sum * annuitRatio;

        return paiment;
    }
}
