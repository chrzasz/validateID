package strings;

/**
 * Created by Grzegorz Chrzaszczyk on 11-12-2018  01:59 PM
 */
public class RemoveWhiteSpace {

    private String str;

    public RemoveWhiteSpace(String str) {
        this.str = removeSpaces(str);
    }

    private String removeSpaces(String param) {
        if (param == null)
            return null;
        param = param.replaceAll("\\s++", "");
        return param;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
