package katas;

import org.junit.Assert;
import org.junit.Test;

public class ConvertStringToCamelCaseTest {

    @Test
    public void toCamelCase() {
        ConvertStringToCamelCase camelCase = new ConvertStringToCamelCase();

        String value = "the-stealth-warrior";
        String expected = "theStealthWarrior";

        String actual = camelCase.toCamelCase(value);

        Assert.assertEquals(expected, actual);
    }
}