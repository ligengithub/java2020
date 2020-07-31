import com.demo.inject.app.Application;
import com.demo.inject.module.MyAppModule;
import com.demo.inject.user.UserService;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.BeforeClass;

/**
 * @author ligen
 * @title: Test
 * @projectName ingect
 * @description:
 * @date 2019/12/178:47
 */
public class Test
{

    private  static Injector injector;

    @BeforeClass
    public static void init(){
        injector = Guice.createInjector( new MyAppModule());
    }


    @org.junit.Test
    public void test(){
//        UserService instance = injector.getInstance(UserService.class);
//        instance.sayHello();
        Application instance = injector.getInstance(Application.class);
        instance.test();
    }




}
