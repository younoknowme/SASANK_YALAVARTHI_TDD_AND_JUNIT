import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationTest {
        StringManipulation stringManipulationObject;

        @Before
        public void initialize() {
                stringManipulationObject = new StringManipulation();
        }

        @Test
        public void emptyString() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("");
                assertEquals("", actual);
        }

        @Test
        public void singleCharacterStringOfA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("A");
                assertEquals("", actual);
        }

        @Test
        public void singleCharacterStringNonA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("B");
                assertEquals("B", actual);
        }

        @Test
        public void doubleCharacterStringDoubleA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("AA");
                assertEquals("", actual);
        }

        @Test
        public void doubleCharacterStringSingleA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("AD");
                assertEquals("D", actual);
        }

        @Test
        public void doubleCharacterStringWithoutA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("SS");
                assertEquals("SS", actual);
        }

        @Test
        public void multiCharacterStringWithSingleAAtBeginning() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("ABCD");
                assertEquals("BCD", actual);
        }

        @Test
        public void multiCharacterStringWithDoubleAAtBeginning() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("AABCD");
                assertEquals("BCD", actual);
        }

        @Test
        public void multiCharacterStringWithNOA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("BCDSDSDSDS");
                assertEquals("BCDSDSDSDS", actual);
        }

        @Test
        public void multiCharacterStringWithOnlyA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("AAAAAAAA");
                assertEquals("AAAAAA", actual);
        }

        @Test
        public void singleCharacterStringWithLowerCaseA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("a");
                assertEquals("", actual);
        }

        @Test
        public void singleCharacterStringWithLowerCaseNonA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("e");
                assertEquals("e", actual);
        }

        @Test
        public void doubleCharacterStringWithOneLowerCaseA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("ab");
                assertEquals("b", actual);
        }

        @Test
        public void doubleCharacterStringWithTwoLowerCaseA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("aa");
                assertEquals("", actual);
        }

        @Test
        public void multiCharacterStringWithSingleLowerCaseA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("abcdefgh");
                assertEquals("bcdefgh", actual);
        }

        @Test
        public void multiCharacterStringWithDoubleLowerCaseA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("aabcdef");
                assertEquals("bcdef", actual);
        }

        @Test
        public void multiCharacterStringWithNoAAtTheBeginning() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("ghaaaaaa");
                assertEquals("ghaaaaaa", actual);
        }

        @Test
        public void multiCharacterStringWithOnlyLowerCaseA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("aaaaaaa");
                assertEquals("aaaaa", actual);
        }

        @Test
        public void doubleCharacterStringWithUpperAndLowerA() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("aA");
                assertEquals("", actual);
        }

        @Test
        public void multiCharacterStringWithUpperAndLowerCaseLetters() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("aAaAsSdD");
                assertEquals("aAsSdD", actual);
        }

        @Test
        public void randomCharacterInput() throws Exception {
                String actual = stringManipulationObject.removeCharacterA("!@#$%^&*(44354");
                assertEquals("!@#$%^&*(44354", actual);
        }
}