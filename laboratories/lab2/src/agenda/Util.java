package agenda;

/**
 * Created by stenio on 26/05/17.
 */
public class Util {
    public static final String ENDLINE = System.lineSeparator();

    public static boolean isStringInArray(String string, String[] stringArray) {
        if (stringArray != null) {
            for (String s : stringArray) {
                if (s != null && s.equals(string)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void validateNull(Object o, String msg) throws Exception {
        if (o == null) {
            throw new Exception(msg + " não pode ser null.");
        }
    }

    public static void validateVazia(String s, String msg) throws Exception {
        validateNull(s, msg);
        if (s.trim().length() == 0) {
            throw new Exception(msg + " não pode ser vazia.");
        }
    }

    public static int tryConvertInt(String possibleNumber, String msg) throws Exception {
        try {
            return Integer.parseInt(possibleNumber);
        } catch (Exception e) {
            throw new Exception(msg);
        }
    }
}
