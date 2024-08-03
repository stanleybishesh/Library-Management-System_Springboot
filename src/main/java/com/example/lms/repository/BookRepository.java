package com.example.lms.repository;

import com.example.lms.model.Book;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findByCode(String code);

    Book findByCodeOrName(String code,String name);

    /* Using Custom Query */
    @Query(nativeQuery = true,value="SELECT * FROM book WHERE code=:code AND name=:name")
    Book findByCodeAndName(@Param("code") String code,@Param("name") String name);
}
