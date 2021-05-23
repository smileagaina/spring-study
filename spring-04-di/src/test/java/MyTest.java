import com.shj.pojo.Address;
import com.shj.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        Address address = (Address) context.getBean("address");
        Address address2 = (Address) context.getBean("address");
        System.out.println(student.toString());
        System.out.println(address == address2);
    }
}
