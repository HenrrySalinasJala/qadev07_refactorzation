package comp.fundacionjala.movies;

import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ChildrenMovieTest {

    public static final int DAYS_RENTED = 5;

    private IMovie movie;

    private String movieTitle = "new movie title";

    @Test
    public void testChildrenMovieInstanceIsNotNull() {
        assertNotNull(new ChildrenMovie(movieTitle));
    }

    @Test
    public void testChildrenMovieCanBeCreatedOnlyWithItsTitle() {
        movie = new ChildrenMovie(movieTitle);
        assertTrue(movie instanceof ChildrenMovie);
    }

    @Test
    public void testChildrenMovieCanCalculateItsRentalCharge() {
        movie = new ChildrenMovie(movieTitle);
        double expectedCharge = 4.5;
        assertEquals(expectedCharge, movie.calculateRentalCharge(DAYS_RENTED), DELTA);
    }

    @Test
    public void testChildrenMovieCanCalculateTheFrequentRenterPoints() {
        movie = new ChildrenMovie(movieTitle);
        int expectedRenterPoints = 1;
        assertEquals(expectedRenterPoints, movie.calculateRenterFrequentPoints(DAYS_RENTED));
    }
}
