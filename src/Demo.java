public class Demo {
    public static void main(String[] args) {

        Servicable s1 = new Car("Toyota", 2020, 15000, 4);
        Servicable s2 = new Bus("Mercedes", 2018, 50000, 40);

        s1.performService(); // Car version
        s2.performService(); // Bus version

        System.out.println(s1.getServiceIntervalKm());
        System.out.println(s2.getServiceIntervalKm());
    }
}
