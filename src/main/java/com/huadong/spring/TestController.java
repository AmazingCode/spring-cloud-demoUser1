package com.huadong.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "name/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable(value = "id") Integer id) {
        User user1 =new User(1,"lhj");
        User user2 =new User(2,"yt");
        if(id==1){
            return user1;
        }
        return user2;
    }
}
