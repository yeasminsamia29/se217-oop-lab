import java.util.Scanner;



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;

            case 2:
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;

            case 3:
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;

            case 4:
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }

    