package validate;

import strings.RemoveWhiteSpace;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  09:45 AM
 */
public class PolishIDVlidator implements Validator {

    @Override
    public boolean validate(String toCheck) {

        int checkSum[] = new int[9];
        int sumValue = 0;

        RemoveWhiteSpace rws = new RemoveWhiteSpace(toCheck);
        toCheck = rws.getStr();

        if (toCheck.length() != 9) {
            System.out.println("Not a valid size! Must be 9 characters");
            return false;
        }

        //check if three first characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isAlphabetic(toCheck.charAt(i))) {
                System.out.println("three first characters are NOT letters!");
                return false;
            }

        }

        //check if remaining are digits
        for (int i = 3; i < 9; i++) {
            if (!Character.isDigit(toCheck.charAt(i))) {
                System.out.println("remaining are NOT digits!");
                return false;
            }

        }

        LettersToDigits ltd = new LettersToDigits();
        int[] weight = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int[] lettersToDigits = new int[9];
        for (int i = 0; i < 9; i++) {
            //numer dowodu osobistego to 6 cyfr z czego pierwsza cyfra to cyfra kontrolna!
            if (i != 3) {
                lettersToDigits[i] = ltd.letterToDigit(String.valueOf(toCheck.charAt(i)));
                checkSum[i] = weight[i] * lettersToDigits[i];
                sumValue += checkSum[i];
            }
            // cyfra kontrolna [3]
            lettersToDigits[3] = ltd.letterToDigit(String.valueOf(toCheck.charAt(3)));
        }

        if ((sumValue % 10) != lettersToDigits[3]) {
            System.out.println("mod 10 error!");
            return false;
        }

        System.out.println("Validation succesfull");
        return true;
    }
}
