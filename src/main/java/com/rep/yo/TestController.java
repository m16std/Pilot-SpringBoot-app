package com.rep.yo;

import com.rep.yo.User;
import com.rep.yo.Users;
import com.rep.yo.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TestController {
    private final UserRepository userRepo;

    public TestController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users-list")
    public List<Users> hello2(){
        return (List<Users>) userRepo.findAll();
    }

    @PostMapping("/new-user")
    public String registerNewUser(@RequestBody User user){
        Users me = new Users();
        me.setName(user.getName());
        userRepo.save(me);

        return "Ok";
    }
    //TODO реализовать
    // @DeleteMapping
    // @PutMapping
}
