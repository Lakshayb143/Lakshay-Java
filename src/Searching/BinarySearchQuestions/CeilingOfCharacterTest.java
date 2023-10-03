package Searching.BinarySearchQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilingOfCharacterTest {

    @Test
    void TestCase1(){
        char[] letters = "cfj".toCharArray();
        char ans = CeilingOfCharacter.nextGreatestLetter(letters,'a');
        assertEquals('c',ans);

    }

    @Test
    void TestCase2(){
        char[] letters = "cfj".toCharArray();
        char ans = CeilingOfCharacter.nextGreatestLetter(letters,'c');
        assertEquals('f',ans);
    }

    @Test
    void TestCase3(){
        char[] letters = "xxyy".toCharArray();
        char ans = CeilingOfCharacter.nextGreatestLetter(letters,'z');
        assertEquals('x',ans);
    }

    @Test
    void TestCase4(){
        char[] letters = "ccdeffghijkl".toCharArray();
        char ans = CeilingOfCharacter.nextGreatestLetter(letters,'z');
        assertEquals('c',ans);
    }
}