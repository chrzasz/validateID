package validate;

/**
 * Created by Grzegorz Chrzaszczyk on 13-12-2018  09:12 AM
 */
public class PolishPESELValidator implements Validator {

    @Override
    public boolean validate(String toCheck) {

        toCheck = toCheck.trim();

//        toCheck.length()

        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int sum=0;


        if (toCheck.length() != 11) {
            System.out.println(toCheck + " ->Not a valid size! Must be 11 characters");
            return false;
        } else {
            for (int i = 0; i < 10; i++)
                sum += Integer.parseInt(toCheck.substring(i, i + 1)) * weights[i];
            int checkVal = Integer.parseInt(toCheck.substring(10, 11));
            sum %= 10;
            sum = 10 - sum;
            sum %= 10;
            System.out.println(toCheck + " ->pesel validation succesfull");
            return (sum == checkVal);
        }
    }
}
