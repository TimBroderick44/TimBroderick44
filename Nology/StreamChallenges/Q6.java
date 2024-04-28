import java.util.HashMap;

public class Q6 {
    public static int getBinaryTranslation(char letter) {
    HashMap<Character, Integer> binaryTranslator = new HashMap<>();
    binaryTranslator.put('a', 0);
    binaryTranslator.put('b', 1);
    binaryTranslator.put('c', 10);
    binaryTranslator.put('d', 11);
    binaryTranslator.put('e', 100);

    if (binaryTranslator.containsKey(letter)) {
    return binaryTranslator.get(letter);
    }

    return -1;
    }

    public static void main(String[] args) {
    System.out.println(getBinaryTranslation('a'));
    }
}
