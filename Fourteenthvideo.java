public class Fourteenthvideo {
        public static void main(String[] args) {

        int[][] marks = {
            {54, 71, 80},
            {45, 82, 66},
            {20, 67, 83}
        };

        int sum = 0;
        int count = 0;

        for (int row = 0; row < marks.length; row++) {

            for (int column = 0; column < marks[row].length; column++) {

                System.out.print(marks[row][column] + " ");

                sum += marks[row][column];
                count++;
            }

            System.out.println();
        }

        double average = (double) sum / count;

        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);

    }
    
}
