public class secondHighestScore {
    public static void main(String[] args) {
        double [] cgpa ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double secondHighest = secondHighestFunction(cgpa);

        System.out.println(secondHighest);
    }

    public static double secondHighestFunction(double [] cgpa){
        double Highest=cgpa[0];
        double secondHighest=cgpa[0];

        for (int i=0;i<cgpa.length;i++){
            if(cgpa[i]>Highest){
                secondHighest=Highest;
                Highest=cgpa[i];
            }
            else if(cgpa[i]>secondHighest){
                secondHighest=cgpa[i];
            }
        }
        return secondHighest;
    }
}
