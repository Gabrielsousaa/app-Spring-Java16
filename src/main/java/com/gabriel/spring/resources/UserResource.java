package com.gabriel.spring.resources;

import com.gabriel.spring.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findall(){
        User u = new User(1L, "Gabriel", "Gabriel@gmail.com", "9999", "12345");
        return ResponseEntity.ok().body(u);
    }
    

}
