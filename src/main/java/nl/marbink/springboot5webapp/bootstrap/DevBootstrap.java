package nl.marbink.springboot5webapp.bootstrap;

import nl.marbink.springboot5webapp.model.Author;
import nl.marbink.springboot5webapp.model.Book;
import nl.marbink.springboot5webapp.repositories.AuthorRepository;
import nl.marbink.springboot5webapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    /*TODO
    Starting with Spring 4.3, if a class, which is configured as a Spring bean,
    has only one constructor, the Autowired annotation can be omitted and
    Spring will use that constructor and inject all necessary dependencies.

    Example:
    You can use 1 constructor instead of using:
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;
    */
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Wrox" );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
