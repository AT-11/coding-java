package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreatePhoneNumberTest {

    @Test
    public void createPhoneNumber() {
        CreatePhoneNumber phoneNumber = new CreatePhoneNumber();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";

        String actual = phoneNumber.createPhoneNumber(numbers);

        Assert.assertEquals(expected, actual);
    }
}