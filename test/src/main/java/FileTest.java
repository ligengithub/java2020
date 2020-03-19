import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ligen
 * @title: FileTest
 * @projectName java2020
 * @description:
 * @date 2020/3/1910:28
 */
public class FileTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(new File("./test/test.txt"));
        fileOutputStream.write("test".getBytes());
        fileOutputStream.close();
    }
}
