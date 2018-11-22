package com.springboot.elastic.repository;

import com.springboot.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book,Integer>{

    public Book findAllByBookNameLike(String bookName);

    public Book findBookByBookName(String bookName);
}
