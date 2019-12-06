package com.rohan.webservice.rest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping(path = "/users")
    public List<User> retrieveAll() {
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{user_id}")
    public Resource<User> retrieveById(@PathVariable(name = "user_id") int userId) {
        User user = userDaoService.findOne(userId);
        if (user == null) {
            throw new UserNotFoundException("Id: " + userId);
        }

        // Using HATEOAS concept
        // "all-users", SERVER_PATH + "/users"
        // Adding link to resource on output
        // Here we can multiple links etc

        // This is 2.2.0 onwards
        /*EntityModel<User> model = new EntityModel<>(user);
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAll());
        model.add(linkTo.withRel("all-users"));*/
        //return model;


        // This is 2.0.0 safe
        Resource<User> resource = new Resource<User>(user);
        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAll());
        resource.add(linkTo.withRel("all-users"));
        return resource;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        User savedUser = userDaoService.save(user);

        // How to return the new URI after the created user
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{user_id}")
    public void deleteUser(@PathVariable(name = "user_id") int userId) {
        User user = userDaoService.deleteById(userId);
        if (user == null) {
            throw new UserNotFoundException("Id: " + userId);
        }
    }

}
