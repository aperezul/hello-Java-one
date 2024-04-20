public class Main {
    public static void main(String[] args) {
        String myFavouriteTea = "Green Tea";
        int amountOfTeaSpoonsToUse = 2;
        System.out.println("My Favourite Tea: " + myFavouriteTea);
        System.out.println("I used " + amountOfTeaSpoonsToUse + " teaspoons of" + myFavouriteTea);
        boolean isTeaBrewed = true;
        if (!isTeaBrewed == true) { //with ! we invert the solution
            System.out.println("let´s brew some tea");
        } else {
            System.out.println("Great, time to sip bit of it");
        }

        double teaPrice = 10.99;

        if (teaPrice < 7.5) {
            System.out.println("It´s on  discount let me buy it");
        } else if (teaPrice <10.99) {
            System.out.println("It´s a good price");
        } else if (teaPrice > 10.00 && teaPrice < 13.50) {
            System.out.println("mmm it is a BIT overpriced");

        } else {
            System.out.println("Waaay to overpriced");
        }

        String teaOrigins = "JaPan     "; //we use trim to trim information so mistakes can be fixed.
        if (teaOrigins.trim().equalsIgnoreCase("Japan")) {
            System.out.println("Wow, I love green tea from Japan");
        }
    }
}