public class stringCount {
    public static void main(String[] args) {
        String myStr = "I am a SQA Engineer";

        int chC = 0;
        int vC = 0;
        int cC = 0;

        String[] words = myStr.split(" ");
        int  wC=words.length;
        System.out.println("words :" +"  "+ wC);


        String lc = myStr.toLowerCase();
        for( char c : lc.toCharArray()){

            if(c!= ' '){
                chC++;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vC++;
            }


            else if (c >= 'a' && c <= 'z') {
                cC++;
            }

        }
        System.out.println("Character :" +"  "+ chC);
        System.out.println("Vowel :" +"  "+ vC);
        System.out.println("Constant :" +"  "+ cC);
    }
}
