import com.shj.config.MyConfig;
import com.shj.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        // 彻底摒弃XML,通过注解去获取上下文。
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = (User) context.getBean("getUser");

        System.out.println(user.getName());
    }
}

