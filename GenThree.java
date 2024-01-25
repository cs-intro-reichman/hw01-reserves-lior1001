public class GenThree {
    public static void main(String[] args) {
        //Recieves a, b from user
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        //Generates 3 random numbers within the given range
        int r1 = (int) (a + Math.random() * (b-a));
        int r2 = (int) (a + Math.random() * (b-a));
        int r3 = (int) (a + Math.random() * (b-a));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        
        //Calculates the minimal generated number 
        int min1 = Math.min(r1, r2);
        int min2 = Math.min(min1, r3);
        
        System.out.println("The minimal generated number was " + min2);

        }

}