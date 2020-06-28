package com.rohan.springboot.basic.springbootbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAll() {
        return Arrays.asList(new Book(1, "Awesome Java 1.90", "Rohan"));
    }

}
