import java.util.Arrays;
import java.util.Scanner;

public class findBinary {
    public static void main(String[] args) {
        double[] cgpa ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        Arrays.sort(cgpa);
        for (double i:cgpa){
            System.out.print(i+" ");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CGPA to search: ");
        double target = scanner.nextDouble();


        int left = 0;
        int right = cgpa.length;
        boolean flag = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == target) {
                flag=true;
                break;
            }

            if (cgpa[mid] < target) {
                left = mid + 1;
            }

            else
                right = mid - 1;
        }


        if(flag){
            System.out.println("found");
        }
        else{
            System.out.println("not found");

        }
    }
}
