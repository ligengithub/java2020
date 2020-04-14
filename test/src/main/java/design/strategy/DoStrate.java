package design.strategy;

/**
 * @author ligen
 * @title: DoStrate
 * @projectName java2020
 * @description:
 * @date 2020/4/816:57
 */
public class DoStrate {

    private PublicInterface publicInterface;

    public DoStrate(PublicInterface publicInterface) {
        this.publicInterface = publicInterface;
    }

    public void exec() {
        publicInterface.method();
    }
}
