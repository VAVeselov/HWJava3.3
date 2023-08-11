public class CreditPaymentService {
    public double calculate(double month, double summa, double persent) {
        double persentInMonth = persent / 12 / 100;
        double annuitRatio = (persentInMonth * Math.pow((1 + persentInMonth), month)) / (Math.pow((1 + persentInMonth), month) - 1);
        double platesh = summa * annuitRatio;

        return platesh;
    }
}
