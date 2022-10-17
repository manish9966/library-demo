import com.sessions.Book;
import com.sessions.Library;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    @Test
    public void addToCatalogue_should_return_2_when_book_add_to_catalogue(){
        Library library = new Library();
        Book newlyCreatedBook = library.addToCatalogue("Discovery of india","Manish",543,450.49);
        assertEquals(2,newlyCreatedBook.getId());
        int totalBooks = library.getBooks().size();
        List<Book>availableBooks = library.getBooks();
        assertThat(totalBooks,equalTo(2));
    }
}

