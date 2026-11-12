public class LifelineSite extends Site {

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
