   import java.util.Scanner;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("\nStudent Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        input.close();
    }