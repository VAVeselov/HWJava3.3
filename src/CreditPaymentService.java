public class CreditPaymentService {
    public double calculate(double month, double summa, double persent) {
        double platesh;
        double persentInMonth = persent / 12 / 100;
        double annuitRatio = (persentInMonth * Math.pow((1 + persentInMonth), month )) /(Math.pow((1+ persentInMonth), month)-1);
        if (month == 12) {
            platesh = summa * annuitRatio;
        } else if (month == 24) {
            platesh = summa * annuitRatio;
        } else {
            platesh = summa * annuitRatio;
        }
        return platesh;
    }
}
