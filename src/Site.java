public abstract class Site {
    public static final double TAX_RATE = 0.13;
    protected double _units;
    protected  double _rate;

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount(double base);
}
