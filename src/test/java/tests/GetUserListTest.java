package tests;
import dto.User;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GetUserListTest extends BaseTest {
    @Test
    public void getUserList() {

        List<User> users = getRequest("/user", 200).body().jsonPath().getList("data", User.class);
        // .body - чтобы забрать тело ответа;
        // .jsonPath() - распарсить;
        // getList("data", User.class) - преобразовать к листу по модели класса User

        System.out.println("First user id " + users.get(0).getId());

        //check that users collection has 20 items
        assertEquals(20, users.size());

        //check that all fields of user are NOT empty
        for (User user : users) {
            assertFalse(user.getId().isEmpty());
            assertFalse(user.getTitle().isEmpty());
            assertFalse(user.getFirstName().isEmpty());
            assertFalse(user.getLastName().isEmpty());
            assertFalse(user.getPicture().isEmpty());
        }

        //check that all picture values ends with ".jpg"
        users.forEach(user -> assertTrue(user.getPicture().endsWith(".jpg")));
    }
}
