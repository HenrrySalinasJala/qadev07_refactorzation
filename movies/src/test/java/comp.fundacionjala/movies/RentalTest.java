package comp.fundacionjala.movies;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RentalTest {

    private static IMovie movie;

    private static final int daysRented = 2;

    @BeforeClass
    public static void setUp() {

        String movieTitle = "title";
        movie = new RegularMovie(movieTitle);
    }

    @Test
    public void aRentalInstanceIsNotNull() {

        assertNotNull(new Rental(movie, daysRented));
    }

    @Test
    public void aRentalInstanceCanBeCreatedWithAMovieAndDaysRented() {

        Rental rental = new Rental(movie, daysRented);
        assertTrue(rental instanceof Rental);
    }
}
