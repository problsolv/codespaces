import java.util.Scanner;
public class LargePower {
    public static void main(String [ ] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a base value: ");
        int base = in.nextInt();
        System.out.print("Enter an exponent value: ");
        int exponent = in.nextInt();
        boolean valid = valid(base, exponent);
        String v = String.valueOf(valid);
        v = v.substring(0,1).toUpperCase() + v.substring(1);
        System.out.println(v);
    }
    public static boolean valid(int ba, int ex) {
        return Math.pow(ba, ex) > 5000;
    }
}
