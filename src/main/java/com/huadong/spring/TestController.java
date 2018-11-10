package com.huadong.spring;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @RequestMapping(value = "path/{id}", method = RequestMethod.GET)
    public User getUserByPathVaribale(@PathVariable(value = "id") Integer id) {
        return getUser(id);
    }

    @RequestMapping(value = "param", method = RequestMethod.GET)
    public User getUserByRequestParam(@RequestParam("id") Integer id) {
        return getUser(id);
    }

    private User getUser(Integer id) {
        User user1 = new User(1, "lhj");
        User user2 = new User(2, "yt");
        if (id == 1) {
            return user1;
        }
        return user2;
    }
}
