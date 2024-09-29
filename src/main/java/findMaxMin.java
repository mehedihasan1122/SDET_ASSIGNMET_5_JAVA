import java.util.Random;

public class findMaxMin {
    public static void main(String[] args) {
        int[]numbers = new int[10];
        Random rand = new Random();


        for(int i=0;i< numbers.length;i++){
            numbers[i]= rand.nextInt(1,50);
            System.out.println(numbers[i]);
        }



        int max=numbers[0];
        int min=numbers[0];

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=max){
                max=numbers[i];
            }

            if(numbers[i]<=min){
                min=numbers[i];
            }
        }

        System.out.println("Maximum Number : "+ max);
        System.out.println("Minimum Number : "+ min);
    }
}
