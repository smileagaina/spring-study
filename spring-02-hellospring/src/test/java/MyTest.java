import com.shj.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象：可以传入多个配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来。
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
