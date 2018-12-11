package validate;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  09:45 AM
 */

@RunWith(JUnitParamsRunner.class)

public class VlidatePolishIDTest {

    @Test
    @Parameters(method = "validatePolishID")
    public void validateTest(String idNo, boolean isOK) {
        Validator validator = new PolishIDVlidator();
        assertEquals(isOK, validator.validate(idNo));
    }

    public Object[] validatePolishID() {
        return new Object[]{
                new Object[]{"", false},
                new Object[]{",.A01", false},
                new Object[]{".........", false},
                new Object[]{"BBB!21111", false},
                new Object[]{"000000000", false},
                new Object[]{"AAAAAAAAA", false},
                new Object[]{"XQZ67956", false},
                new Object[]{"ASA321321", false},
                new Object[]{"GRG666666", false},
                new Object[]{"ABA300000", true},
                new Object[]{" A B S 1 23  4 56    ", true},
                new Object[]{"TGH 725413 ", true},
                new Object[]{"pag735837", true},
                new Object[]{"YvT686266", true},
                new Object[]{"JVD956294", true},
                new Object[]{"DQU122912", true},
                new Object[]{"JBN729087", true},
                new Object[]{"CXD150217", true},
                new Object[]{"GZJ599737", true},
                new Object[]{"EYP509827", true},
                new Object[]{"JTS648150", true},
                new Object[]{"NHQ756574", true},
                new Object[]{"XQZ679563", true},
        };
    }


}
