public class Main {
    public static void main(String[] args) {
        int rubles = 20;
        int price = 21569;
        int miles = price / rubles;
        System.out.println("За покупку на " + price + " рублей");
        System.out.println(miles + " миль заработано");
    }
}