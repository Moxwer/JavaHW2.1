public class Main {
    public static void main(String[] args) {
        int tiket = 2_000;
        int howManyTickets = 2;
        int bonusMiles = tiket * howManyTickets / 20 * 1;
        System.out.println("Накопленные бонусные мили:" + bonusMiles);
    }
}
