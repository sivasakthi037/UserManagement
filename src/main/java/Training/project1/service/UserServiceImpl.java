package Training.project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Training.project1.entity.User;
import Training.project1.repository.UserRepository;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public String updateUser(User user) {
        if (userRepository.existsById(user.getId())) {
            userRepository.save(user);
            return "User updated successfully";
        }
        return "User not found";
    }

    public String deleteUser(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        }
        return "User not found";
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }
}
