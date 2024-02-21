public class Assign3Q3 {
    public static void main(String args[]) {
        int currentValue = 5;

        System.out.println("The number is: " + currentValue);

        int answer = 1;
        for (int i = 1; i <= currentValue; i++) {
            answer *= i;
        }
        System.out.println("Factorial of " + currentValue + " is: " + answer);
    }
}