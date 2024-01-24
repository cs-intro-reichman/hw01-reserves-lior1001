public class LinearEq {
    public static void main(String[] args) {
        // Recieves a, b and c from user
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        //Calculates x
        double x = (c - b) / a;

        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("x = " + x);
        }
}