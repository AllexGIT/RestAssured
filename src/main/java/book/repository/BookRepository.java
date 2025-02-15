package book.repository;


import book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookRepository extends JpaRepository<Book, Long> {
    Collection<Book> findByAccountUsername(String username);
}