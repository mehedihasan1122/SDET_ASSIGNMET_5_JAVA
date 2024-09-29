public class removeVowels {
    public static void main(String[] args) {
        String myStr = " I am a SQA Engineer";
        String vowel = "aeiou";
        String myStrLc = myStr.toLowerCase();

        StringBuilder result = new StringBuilder();

        for(char c:myStrLc.toCharArray()){

            if(vowel.indexOf(c)==-1){
                result.append(c);
            }
        }

        System.out.println(result);

    }
}
