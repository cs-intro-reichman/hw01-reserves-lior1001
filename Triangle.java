public class Triangle {
    public static void main(String[] args) {
        // Recieves a, b and c from user
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        //Calculates the sum of the lengths of two sides
        double sides = a + b;

        //Determines if the lengths of two sides is 
        boolean isTri = (sides > c);

        System.out.println(a + ", " + b + ", " + c + ": " + isTri);
        }
}