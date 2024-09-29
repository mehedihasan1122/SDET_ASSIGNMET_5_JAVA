import java.util.Arrays;
import java.util.Scanner;

public class demonetization {
    public static void main(String[] args) {
        int [] notes = {1000,500,200,100,50,20,10,5,2,1};
        int counter = 0;

        System.out.println(Arrays.toString(notes));


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount");
        int amount = scanner.nextInt();

        for(int i=0;i<notes.length;i++){


            counter = amount/notes[i];
            if(counter>0){
                amount=amount%notes[i];
                System.out.println(notes[i]+" "+counter);
                //   System.out.println(amount);

            }
        }
    }
}
