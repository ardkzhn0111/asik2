public abstract class Vehicle implements Servicable{
    protected int id;
    protected static int id_gen = 1;
    protected String model;
    protected int year;
    protected double basePrice;

    protected Vehicle(String model, int year, double basePrice) {
        this.id = id_gen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    public void setYear(int year) {
        if(year < 1886 || year > 2026) {
            throw new IllegalArgumentException("Incorrect year");
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot be null or empty");
        }
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBasePrice(double basePrice) {
        if(basePrice < 0) {
            throw new IllegalArgumentException("Must be greater than 0");
        }
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge(int CurrYear) {
        return CurrYear - year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                '}';
    }
}
