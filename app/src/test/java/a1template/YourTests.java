// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;
@test
public class YourTests {
    public void encodeTest(){
        CaesarCipher test = new CaesarCipher(3);
        assertEquals("Is a returned by the 0 index?", test.encode("abc"), "def");
    }
    


    public static void main(String[] args) {
        YourTests test = new YourTests();
        test.encodeTest();
    }

}