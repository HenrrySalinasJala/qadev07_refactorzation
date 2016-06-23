package comp.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RentalTest {

    private IMovie movie;

    private static final int DAYS_RENTED = 2;

    @Before
    public void setUp() {
        final String movieTitle = "title";
        movie = new RegularMovie(movieTitle);
    }

    @Test
    public void aRentalInstanceIsNotNull() {
        assertNotNull(new Rental(movie, DAYS_RENTED));
    }

    @Test
    public void aRentalInstanceCanBeCreatedWithAMovieAndDaysRented() {
        Rental rental = new Rental(movie, DAYS_RENTED);
        assertTrue(rental instanceof Rental);
    }
}
