public class CreditPaymentService {
    public double calculate(double year, double summa, double persent) {
        double platesh;
        if (year == 1) {
            platesh = (summa + ((summa / 100) * persent)) / 12;
        } else if (year == 2) {
            platesh = (summa + ((summa / 100) * persent)) / 24;
        } else {
            platesh = (summa + ((summa / 100) * persent)) / 36;
        }
        return platesh;
    }
}
