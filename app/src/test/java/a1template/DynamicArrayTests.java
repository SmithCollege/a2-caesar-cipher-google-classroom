/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;

public class DynamicArrayTests {
    Character[] alphabet;
    Integer[] count;

    public void createAlphabet(){
        this.alphabet = new Character[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = Character.valueOf((char) ('a' + i));
        }
    }

    public void createCount(){
        this.count = new Integer[10];
        for (int i = 0; i < 10; i++) {
            count[i] = Integer.valueOf(i);
        }
    }

    @Test
    public void basicAlphaTest() {
        // Create the base arrays that we will use to create DynamicArrays
        createAlphabet();

        DynamicArray<Character> alphaTest = new DynamicArray<Character>(this.alphabet);
        assertTrue("Is a returned by the 0 index?", alphaTest.get(0) == 'a');
        assertTrue("Is z returned by the 25th index?", alphaTest.get(25) == 'z');
    }

    @Test
    public void basicNumberTest() {
        // Create the base arrays that we will use to create DynamicArrays
        createCount();


        DynamicArray<Integer> numberTest = new DynamicArray<Integer>(this.count);
        assertEquals("Is a returned by the 0 index?", numberTest.get(0) == 0);

       
        assertTrue("Is z returned by the 9th index?", numberTest.get(9) == 9);
    }

    @Test
    public void offsetAlphaTest() {
        // Create the base arrays that we will use to create DynamicArrays
        createAlphabet();

        DynamicArray<Character> alphaTest = new DynamicArray<>(this.alphabet);
        System.out.println(alphaTest.get(0, 3));
        assertEquals("Is d returned by the 0 index (offset 3)?",
                alphaTest.get(0, 3).charValue(), 'd');

        assertEquals("Is c returned by the -1 index (offset 3)?",
                alphaTest.get(-1, 3).charValue(), 'c');

        assertEquals("Is a returned by the -3 index (offset 3)?",
                alphaTest.get(-3, 3).charValue(), 'a');

    }

    @Test
    public void offsetNumberTest() {
        // Create the base arrays that we will use to create DynamicArrays
        createCount();

        DynamicArray<Integer> numberTest = new DynamicArray<Integer>(this.count);
        assertTrue("Is 5 returned by the 0 index?", numberTest.get(0, 5) == 5);
        assertTrue("Is 0 returned by the -5 index?", numberTest.get(-5, 5) == 0);
    }
   


} 

