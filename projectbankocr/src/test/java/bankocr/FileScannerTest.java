package bankocr;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class FileScannerTest {
    File file = new File("src/main/java/files/123456789.txt");
    FileScanner fileScanner = new FileScanner();

    @Test
    public void verify_ifFileExist_true() {
        boolean exists = file.exists();
        Assert.assertTrue(exists);
    }

    @Test
    public void scanFile_fileNumbers123456789_123456789() {
        String filePath = "src/main/java/files/123456789.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "123456789";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers000000000_000000000() {
        String filePath = "src/main/java/files/000000000.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "000000000";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers111111111_111111111() {
        String filePath = "src/main/java/files/111111111.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "111111111";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers222222222_222222222() {
        String filePath = "src/main/java/files/222222222.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "222222222";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers333333333_333333333() {
        String filePath = "src/main/java/files/333333333.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "333333333";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers444444444_444444444() {
        String filePath = "src/main/java/files/444444444.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "444444444";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers555555555_555555555() {
        String filePath = "src/main/java/files/555555555.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "555555555";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers666666666_666666666() {
        String filePath = "src/main/java/files/666666666.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "666666666";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers777777777_777777777() {
        String filePath = "src/main/java/files/777777777.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "777777777";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers88888888_88888888() {
        String filePath = "src/main/java/files/888888888.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "888888888";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scanFile_fileNumbers999999999_999999999() {
        String filePath = "src/main/java/files/999999999.txt";
        String actual = fileScanner.scanFile(filePath);
        String expected = "999999999";
        Assert.assertEquals(expected, actual);
    }
}