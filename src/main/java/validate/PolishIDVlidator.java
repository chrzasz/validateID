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
            System.out.println(toCheck + " ->Not a valid size! Must be 9 characters");
            return false;
        }

        //check if three first characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isAlphabetic(toCheck.charAt(i))) {
                System.out.println(toCheck + " ->three first characters are NOT letters!");
                return false;
            }

        }

        //check if remaining are digits
        for (int i = 3; i < 9; i++) {
            if (!Character.isDigit(toCheck.charAt(i))) {
                System.out.println(toCheck + " ->only three letter allowed, next must be digits!");
                return false;
            }

        }

        LettersToDigits ltd = new LettersToDigits();
        int[] weight = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int[] lettersToDigits = new int[9];
        for (int i = 0; i < 9; i++) {

            lettersToDigits[i] = ltd.letterToDigit(String.valueOf(toCheck.charAt(i)));
            checkSum[i] = weight[i] * lettersToDigits[i];
            sumValue += checkSum[i];

        }

        if ((sumValue % 10) != 0) {
            System.out.println(toCheck + " ->mod 10 error!");
            return false;
        }

        System.out.println(toCheck + " ->ID validation succesfull");
        return true;
    }
}
