package validate;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  10:16 AM
 */
public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {

            for (int i = 0; i < args.length; i++) {
                if (args[i].length() == 9) {
                    parseID(args[i]);
                }
                if (args[i].length() == 11) {
                    parsePESEL(args[i]);
                };
            }

        } else {
            String s = "running without arguments!";
            System.out.println(s);

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nType polish ID number for validation:");
            s = scanner.next();
            Validator idPL = new PolishIDVlidator();
            idPL.validate(s);

            System.out.print("\nType polish PESEL number for validation:");
            s = scanner.next();
            Validator pesel = new PolishPESELValidator();
            pesel.validate(s);
        }

    }

    public static void parseID (String idNo) {

        Validator idPL = new PolishIDVlidator();
        idPL.validate(idNo);
    }

    public static void parsePESEL(String psl) {

        Validator pesel = new PolishPESELValidator();
        pesel.validate(psl);
    }





}
