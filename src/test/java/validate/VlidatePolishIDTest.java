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
    public void calculatorTest(String idNo, boolean isOK) {
        Validator validator = new VlidatePolishID();
        assertEquals(isOK, validator.validate(idNo));
    }

    public Object[] validatePolishID() {
        return new Object[]{
                new Object[]{"AAA000000", false},
                new Object[]{"ABA300000", true},
                new Object[]{"XZJ538979", true},
                new Object[]{"XQZ679563", true},
                new Object[]{"ABS 123456", true},
                new Object[]{"TGH 725413 ", true},

        };
    }


}
