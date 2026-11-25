import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String a = "ggii";
        String b = "eekk";

        System.out.print(validAnagram(a, b));
    }

    public static boolean validAnagram(String a, String b) {
        byte[] aArray = a.getBytes(StandardCharsets.UTF_8);
        byte[] bArray = b.getBytes(StandardCharsets.UTF_8);

        if(aArray.length != bArray.length) {
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i <= aArray.length - 1; i++) {

            count[aArray[i] - 'a']++;
            count[bArray[i] - 'a']--;
        }

        for(int value : count) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    }
}