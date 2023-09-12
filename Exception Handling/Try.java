

public class Try {
    public static void main(String[] args) {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 12 / num1;
            System.out.println(num2);
            System.out.println("End Of Try Block");
        }

        catch (ArithmeticException e) {
            System.out.println("Wrong");
        }

        System.out.println("I am out");
    }
}
