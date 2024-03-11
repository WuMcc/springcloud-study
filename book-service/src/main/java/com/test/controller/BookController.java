package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Resource
    BookService bookService;
    @RequestMapping("/book/{bid}")
    public Book getBookById(@PathVariable int bid){
        return bookService.getBookById(bid);
    }
}
