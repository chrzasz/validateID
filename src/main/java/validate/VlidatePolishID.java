package validate;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  09:45 AM
 */
public class VlidatePolishID implements Validator {

    @Override
    public boolean validate(String toCheck) {

        if (toCheck.length() != 9) {
            System.out.println("Not a valid size! Must be 9 characters");
            return false;
        }
        return true;
    }
}
