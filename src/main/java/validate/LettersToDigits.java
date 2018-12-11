package validate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  10:31 AM
 */
class LettersToDigits {

    int letterToDigit(String letter) {

        letter = letter.toUpperCase();

        char c;
        
        if (letter.length()==1) {
            c = letter.charAt(0);
            Map<Character, Integer> m1 = new HashMap<>();
            m1.put('0', 0);
            m1.put('1', 1);
            m1.put('2', 2);
            m1.put('3', 3);
            m1.put('4', 4);
            m1.put('5', 5);
            m1.put('6', 6);
            m1.put('7', 7);
            m1.put('8', 8);
            m1.put('9', 9);
            m1.put('A', 10);
            m1.put('B', 11);
            m1.put('C', 12);
            m1.put('D', 13);
            m1.put('E', 14);
            m1.put('F', 15);
            m1.put('G', 16);
            m1.put('H', 17);
            m1.put('I', 18);
            m1.put('J', 19);
            m1.put('K', 20);
            m1.put('L', 21);
            m1.put('M', 22);
            m1.put('N', 23);
            m1.put('O', 24);
            m1.put('P', 25);
            m1.put('Q', 26);
            m1.put('R', 27);
            m1.put('S', 28);
            m1.put('T', 29);
            m1.put('U', 30);
            m1.put('V', 31);
            m1.put('W', 32);
            m1.put('X', 33);
            m1.put('Y', 34);
            m1.put('Z', 35);

            // Iterate over all map, using the keySet method.
            for (Character key : m1.keySet()) {
                if (key == c)
                    return m1.get(key);
            }
        }


        return -1;

    }
}
