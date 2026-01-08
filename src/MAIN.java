public class MAIN {
    public static void main(String[] args) {

        Servicable s1 = new Car("lamboooo", 2020, 15000, 2);
        Servicable s2 = new Bus("jaguarrrrrrrr", 1990, 5000, 40);

        s1.performService();
        s2.performService();

        System.out.println(s1.getServiceIntervalKm());
        System.out.println(s2.getServiceIntervalKm());
    }
}
