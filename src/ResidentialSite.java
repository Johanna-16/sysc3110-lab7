public class ResidentialSite extends Site{
    public double getBillableAmound() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
