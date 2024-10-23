package ma.emsi.Service;

import ma.emsi.DAO.User;
import ma.emsi.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserInterfaceImpl implements UserInterface{
    @Autowired
    private UserRepo userRepo;
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User findUserById(Long id) {
        return userRepo.findById(id).get();
    }
}
