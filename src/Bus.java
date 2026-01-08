public class Bus extends Vehicle {
    private int passengerCapacity;

    protected Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        int Age = getAge(2026);
        return basePrice / 19 + Age * 123;
    }

    @Override
    public void performService() {
        System.out.println("remont remont");
    }

    @Override
    public int getServiceIntervalKm() {
        return 54321;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                ", capacity=" + passengerCapacity +
                '}';
    }
}
