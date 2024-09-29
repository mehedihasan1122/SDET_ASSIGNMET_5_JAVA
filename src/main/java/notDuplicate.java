public class notDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

        for(int i=0;i<numbers.length;i++){

            boolean flag=false;

            for(int j=0;j<numbers.length;j++){
                if(i != j && numbers[i]==numbers[j]){

                    flag=true;

                    break;
                }

            }

            if(!flag){
                System.out.println(numbers[i]);
            }
        }
    }
}
