Package com.Revature.services;

import org.springframework.stereotype.Service;


@Service
public class userService{
    private userRepository userRepo;

    @Autowired
    public userService(userRepository userRepo){
        this.userRepo = userRepo;
    }

    public User getUserById(int userId){
        if (userId <= 0){
            return null;
        }
        return userRepo.findByUserId(userId);
    }

    public User getUserByEmail(String email){
        if (email == null || email.isEmpty()){
            return null;
        }
        else if(!email.contains("@") || !email.contains(".")){
            return null;
        }
        return userRepo.findByEmail(email);
    }

}