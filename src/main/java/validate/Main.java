package validate;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  10:16 AM
 */
public class Main {

    public static void main(String[] args) {

        String id0 = "ABA300000";
        String id = "cde300000";

        System.out.print("Type your polish ID no: " + id);
        Validator validator = new VlidatePolishID();
        System.out.print("\tsize=" + id.length() + "\t");
        System.out.println("Validator = " + validator.validate(id));


        LettersToDigits ltd = new LettersToDigits();
        for (int i = 0; i < 3; i++) {
            System.out.print(ltd.letterToDigit(String.valueOf(id.charAt(i))) + ", ");
        }


    }
}
