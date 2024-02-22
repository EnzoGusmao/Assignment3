public class Assign3Q5 {
    public static void main(String args[]) {
        int currentValue = 5;

        System.out.println("The number is: " + currentValue);

        int answer = 1;
        int i = 1;
        while (i <= currentValue) {
            answer *= i;
            i++;
        }
        System.out.println("Factorial of " + currentValue + " is: " + answer);
    }
}