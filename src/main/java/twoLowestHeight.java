import java.util.Scanner;

public class twoLowestHeight {
    public static void main(String[] args) {

        int[] heights = new int[10];
        Scanner scanner = new Scanner(System.in);




        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of baby " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }


        int lowest = heights[0];
        int secondLowest = heights[0];


        for (int babyHeight : heights) {
            if (babyHeight < lowest) {
                secondLowest = lowest;
                lowest = babyHeight;
            } else if (babyHeight < secondLowest && babyHeight != lowest) {
                secondLowest = babyHeight;
            }
        }


        System.out.println("The two lowest heights of babies are: " + lowest + " cm and " + secondLowest + " cm.");
    }
}
