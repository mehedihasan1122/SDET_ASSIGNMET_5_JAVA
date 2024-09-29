import java.util.Arrays;

public class descOrder {
    public static void main(String[] args) {
        double [] score = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for(int i=0;i< score.length;i++){
            for(int j=i+1;j< score.length;j++){
                if(score[j]>score[i]){
                    double temp = score[i];
                    score[i]=score[j];
                    score[j] = temp;

                }

            }


        }
        System.out.println(Arrays.toString(score));
    }
}
