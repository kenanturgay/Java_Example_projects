public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(fibonacci(6));
        System.out.println(isArmstrong(94));
    }


    public static boolean isPrime(int num1) {


        if (num1 <= 1) return false;

        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) return false;
        }

        return true;
    }

    public static int fibonacci(int num2) {

        int x = 0;
        int y = 1;
        for (int i = 0; i < num2; i++) {

            int z = x + y;
            x = y;
            y = z;
        }

        return y;
    }

    public static boolean isArmstrong(int num3) {

        if (num3 <= 0) {
            return false;
        }

        int originalNumber = num3;
        int numDigits = Integer.toString(num3).length();
        int sum = 0;

        while (num3 > 0) {
            int digit = num3 % 10;
            sum += Math.pow(digit, numDigits);
            num3 /= 10;

        }

        return sum == originalNumber;


    }
}