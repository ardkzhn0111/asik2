public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        setPassengerCapacity(passengerCapacity);
    }

    // Getter
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Setter with validation
    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("Passenger capacity must be positive");
        }
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void performService() {
        System.out.println("Bus service: engine inspection, safety systems check.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2026);
        return basePrice * 0.08 + passengerCapacity * 50 + age * 150;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}

