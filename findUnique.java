import java.util.HashMap;

public class findUnique {

    public static int firstUniqueCharacter(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCountMap.get(ch) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String str = "helloworld";
        int index = firstUniqueCharacter(str);
        System.out.println(index);
    }
}
