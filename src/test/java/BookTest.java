import edu.uic.cs398.Book.Book;
import edu.uic.cs398.Book.BookFactory;
import edu.uic.cs398.Book.impl.HowDemocraciesDie;
import org.junit.*;

public class BookTest {
    @Test
    public void getHowDemocraciesDie() {
        Book book = BookFactory.getBook(1);
        Assert.assertEquals(HowDemocraciesDie.class, book.getClass());
    }

    @Test
    public void oneEqualsOne() {
        Assert.assertEquals(1, 1);
    }
}
