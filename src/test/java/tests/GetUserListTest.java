package tests;

import dto.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GetUserListTest extends BaseTest{
    @Test
    public void getUserList() {

    List<User> users = getRequest("/user", 200).body().jsonPath().getList("data", User.class);
        System.out.println("First user id " + users.get(0).getId());

        //check that users collection has 20 items
        assertEquals(users.size(), 20);

        //check that all fields of user are NOT empty
       // users.forEach(user -> assertFalse(user.isEmpty()));




        //check that all picture values ends with ".jpg"
    for(User user: users){
    assertTrue(user.getPicture().endsWith(".jpg"));
    }


    }
}
