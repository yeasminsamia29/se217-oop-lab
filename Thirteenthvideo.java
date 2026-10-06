public class Thirteenthvideo {
        public static void main(String[] args) {

        int[] marks = {58, 34, 28, 53, 88};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Third mark: " + marks[2]);

        marks[1] = 58;

        System.out.println("Updated second mark: " + marks[1]);

        System.out.println("All marks:");

        for (int mark : marks) {
            System.out.println(mark);
        }

    }
    
}
