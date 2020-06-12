import com.demo.netio.block.BlockIOClient;
import org.junit.Test;

import java.io.IOException;

/**
 * @author ligen
 * @title: Test
 * @projectName java
 * @description:
 * @date 2020/5/610:52
 */
public class MyTest {


    @Test
    public void testBlockIo() throws IOException, InterruptedException {
        int clientCnt = 1000;
        for (int i = 0; i < clientCnt; i++) {
             Thread.sleep(100);
            BlockIOClient blockIOClient = new BlockIOClient();
            blockIOClient.connectToServer();
        }
        Thread.currentThread().join();
    }
}
