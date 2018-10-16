package controller;

import Entity.User;
import dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findByid(@PathVariable long id){
        User findOne=this.userRepository.findOne(id);
        return findOne;
    }
}
