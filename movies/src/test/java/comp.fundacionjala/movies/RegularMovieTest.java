package comp.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RegularMovieTest {

    @Test
    public void aRegularMovieInstanceIsNotNull() {
        assertNotNull(new RegularMovie("new movie title"));
    }

    @Test
    public void aRegularMovieCanBeCreatedOnlyWithItsTitle() {
        RegularMovie movie = new RegularMovie("new movie title");
        assertTrue(movie instanceof RegularMovie);
    }

    @Test
    public void aRegularMovieCanCalculateItsRentalCharge() {
        IMovie movie = new RegularMovie("children title movie");
        assertEquals(6.5, movie.calculateRentalCharge(5), 00000000001);
    }

    @Test
    public void aRegularMovieCanCalculateTheFrequentRenterPoints() {
        RegularMovie movie = new RegularMovie("title");
        assertEquals(1, movie.calculateRenterFrequentPoints(10));
    }
}
