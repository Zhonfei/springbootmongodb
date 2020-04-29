package com.study.chapter0602.dao;

import com.study.chapter0602.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ZF on 2020/4/29.
 */
public interface BookDao extends MongoRepository<Book,Integer>{

    List<Book> findByAuthorContains(String author);

    Book findByNameEquals(String name);
}
