public class ResidentialSite extends Site{

    public double getBaseAmount() {
        return _units * _rate;
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }
}
