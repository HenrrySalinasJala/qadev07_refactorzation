package comp.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MovieTest {

    @Test
    public void aMovieInstanceIsNotNull() {
        assertNotNull(new Movie("new movie title"));
    }

    @Test
    public void aMovieCanBeCreatedWithItsTitleAndPriceCode() {
        Movie movie = new Movie("new movie title");
        assertTrue(movie instanceof Movie);
    }

    @Test
    public void movieTitleCanBeUpdated() {
        Movie movie = new Movie("2");
        String newTitle = "new title movie";
        movie.setTitle(newTitle);
        assertEquals(newTitle, movie.getTitle());
    }
}
