package com.stackroute.pe4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest
{
        ReplaceString replacestring;
        String result="";

        @Before
        public void setUp()
        {
            replacestring=new ReplaceString();
        }

        @Test
        public void givenInputStringShouldReturnReplacedCharacters()
        {
            result = replacestring.checkReplaceString("daily dry");
            assertEquals("characters are not replaced properly","faity fry",result);
        }

        @Test
        public void givenInputStringShouldNotReturnReplacedCharacters()
        {
            result=replacestring.checkReplaceString("aaaa");
            assertEquals("characters are not to be replaced","aaaa",result);
        }

        @Test
        public void givenInputStringShouldNotReturnCharacters()
        {
            result = replacestring.checkReplaceString("baby is crying");
            assertEquals("characters are not to be replaced", "baby is crying", result);
        }
        @After
        public void gearDown()
        {
            replacestring=null;
        }
    }

