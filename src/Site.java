public abstract class Site {
    public static final double TAX_RATE = 0.13;
    protected double _units;
    protected  double _rate;

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount(double base);

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount(base);

        return base + tax;
    }
 }

 // S - single responsibility
// O - Open/closed Open for extension, closed for modification.
// L - Liskov Substitution Principle - the parent class should not include stuff that the child can not do
// I - Interface Segregation - subclasses should not have to implement methods that it does not need
// D - Dependency Inversion - abstraction less coupling 