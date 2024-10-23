package ma.emsi.Controller;

import ma.emsi.DAO.User;
import ma.emsi.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserInterface userInterface;

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userInterface.getAllUsers();
    }

    @RequestMapping("/getUserById")
        public User getUser(Long id){
        return userInterface.findUserById(id);
    }

    @RequestMapping("/createUser")
    public void createUser(User user){
        userInterface.createUser(user);
    }

    @RequestMapping("/deleteUser")
    public void deleteUserById(Long id){
        userInterface.deleteUserById(id);
    }
}
