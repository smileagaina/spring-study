import com.shj.dao.UserMysqlImpl;
import com.shj.dao.UserOracleImpl;
import com.shj.service.UserServiceImpl;
import com.shj.service.UserService;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层他们不需要接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserOracleImpl());
        userService.getUser();
    }
}
