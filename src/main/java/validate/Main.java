package validate;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  10:16 AM
 */
public class Main {

    public static void main(String[] args) {

        String id = "YFG082656";

        Validator idPL = new PolishIDVlidator();
        idPL.validate(id);

    }
}
