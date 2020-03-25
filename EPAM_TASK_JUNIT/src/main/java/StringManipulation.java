
public class StringManipulation {

    public String removeCharacterA(String string) {

        //variable to store length of the String
        int lengthOfString = string.length();

        if (lengthOfString == 0) {
            return "";
        }

        StringBuilder temporaryStringHolder = new StringBuilder(string);

        if (lengthOfString == 1) {
            if (string.charAt(0) == 'A' || string.charAt(0) == 'a')
                return "";
            else
                return string;
        }

        if (string.charAt(0) == 'a' || string.charAt(0) == 'A')
            temporaryStringHolder.replace(0, 1, "");
        if (string.charAt(1) == 'a' || string.charAt(1) == 'A')
            temporaryStringHolder.replace(0, 1, "");
        return temporaryStringHolder.toString();

    }
}
