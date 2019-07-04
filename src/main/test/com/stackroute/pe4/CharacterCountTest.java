package com.stackroute.pe4;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


import static org.junit.Assert.*;

public class CharacterCountTest
{
    CharacterCount charactercount;
        int result; // Declaration
        @Before
        public void setUp()
        {
            charactercount=new CharacterCount(); // Object Creation
        }
        @Test
        public void givenInputStringShouldReturnSpecificCharacterCount()
        {
            result=charactercount.countCharacter("Java is java again java again");
            assertEquals("character count is not exact",10,result);
        }
        @Test
        public void givenInputAlphaNumericStringShouldNotReturnCharacterCount()
        {
            result=charactercount.countCharacter("Susmith456dswhdhdiwnmjdv");
            assertEquals("character count is displaying",0,result);
        }
        @Test
        public void givenInputNullStringShouldNotReturnCharacterCount()
        {
            result=charactercount.countCharacter("");
            assertEquals("test case failed as count is displayed for null input",0,result);
        }

        @Test
        public void givenSpecialCharactersInputStringShouldNotReturnCharacterCount()
        {
            result=charactercount.countCharacter("@#%$&@&*");
            assertEquals("test case failed",0,result);
        }
        @After
        public void tearDown()
        {
            charactercount=null;
        }
    }


