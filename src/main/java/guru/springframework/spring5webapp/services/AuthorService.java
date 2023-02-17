package guru.springframework.spring5webapp.services;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;

public interface AuthorService {
    Iterable<Author> findAll();
}
