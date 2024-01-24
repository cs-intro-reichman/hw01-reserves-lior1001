public class Gen3 {
    public static void main(String[] args) {
        // Recieves a, b from user
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        //Generates 3 random numbers within the given range
        int r1 = (int) (Math.random() * (b-a));
        int r2 = (int) (Math.random() * (b-a));
        int r3 = (int) (Math.random() * (b-a));

        //Calculates the minimal generated number 
        double min1 = Math.min((double) r1, (double) r2);
        double min2 = Math.min(min1, (double) r3);

        int min = (int) min2;

        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("The minimal generated number was " + min);
        }
}