public class Coins {
    public static void main(String[] args) {
        // Recieves a number cents from user
        int a = Integer.parseInt(args[0]);

        //Calculates the quarters
        int q = a / 25;
        
        //Calculates the cents
        int c = a % 25;

        System.out.println("Use " + q + " quarters and " + c + " cents");
        }
}