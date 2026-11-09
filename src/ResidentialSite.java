public class ResidentialSite extends Site{
    public double getBillableAmound() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    public double getBaseAmount() {
        return _units * _rate;
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }
}
