import java.util.Scanner;
public class LargePower {
    public static void main(String [ ] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a base value: ");
        int base = in.nextInt();
        System.out.print("Enter an exponent value: ");
        int exponent = in.nextInt();
        System.out.println(valid((int)Math.pow(base, exponent)));
    }
    public static boolean valid(int pow) {
        return pow > 5000;
    }
}
