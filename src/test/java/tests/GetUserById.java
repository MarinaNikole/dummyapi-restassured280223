package tests;

import dto.User;
import dto.UserFull;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetUserById extends BaseTest{






        //picture starts with "https:"


    @Test
    public void getUserByValidId(){

        List<User> users = getRequest("/user", 200).body().jsonPath().getList("data", User.class);
       String id = users.get(0).getId();

        UserFull response =  getRequest("/user/" + id , 200).body().jsonPath().getObject("data", UserFull.class);

        //picture starts with "https:"
       // assertTrue(response.getPicture().startsWith("https:"));

    }
}
