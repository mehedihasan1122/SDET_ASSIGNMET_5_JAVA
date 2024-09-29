import java.util.HashMap;

public class charOccurences {
    public static void main(String[] args) {
        String myStr = "I live in Dhaka";



        HashMap<Character, Integer> count = new HashMap<>();


        for (char myChar : myStr.toLowerCase().toCharArray()) {

            if (myChar != ' ') {

                count.put(myChar, count.getOrDefault(myChar, 0) + 1);
            }
        }


        for (char ch : count.keySet()) {
            System.out.println(ch + " " + count.get(ch));
        }
    }
}
