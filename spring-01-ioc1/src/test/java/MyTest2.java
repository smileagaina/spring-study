import com.shj.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    public static void main(String[] args) {
        // 获取ApplicationContext; 拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 对象都已经在容器里面了，需要什么获取什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
