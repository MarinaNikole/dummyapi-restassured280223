package tests;
import dto.User;
import dto.UserFull;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetUserById extends BaseTest {

    @Test
    public void getUserByValidId() {

        List<User> users = getRequest("/user", 200).body().jsonPath().getList("data", User.class);

        String id = users.get(0).getId(); // вытаскиваю значение id у первого пользователя

        UserFull response = getRequest("/user/" + id, 200).body().jsonPath().getObject("", UserFull.class);



        //picture starts with "https:"
        assertTrue(response.getPicture().startsWith("https:"));



        //check that city name is "Kongsvinger"
        assertEquals("Kongsvinger", response.getLocation().getCity());
        System.out.println(response.getLocation().getCity());

    }
}
