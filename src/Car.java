public class Car extends Vehicle {
    private int numberOfDoors;

    protected Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        int Age = getAge(2026);
        return basePrice / 10 + Age * 200;
    }

    @Override
    public void performService() {
        System.out.println("Clean, clean, engiiineee");
    }

    @Override
    public int getServiceIntervalKm() {
        return 1234;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                ", numDoors=" + numberOfDoors +
                '}';
    }
}
