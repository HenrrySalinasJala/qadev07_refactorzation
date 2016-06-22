package comp.fundacionjala.movies;

import org.junit.BeforeClass;
import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ChildrenMovieTest {

    public static final int DAYS_RENTED = 5;

    private static IMovie movie;

    private static String MOVIE_TITLE = "new movie title";
    @BeforeClass
    public static void setUp(){
        movie = new ChildrenMovie(MOVIE_TITLE);
    }

    @Test
    public void testChildrenMovieInstanceIsNotNull() {
        assertNotNull(new ChildrenMovie(MOVIE_TITLE));
    }

    @Test
    public void testChildrenMovieCanBeCreatedOnlyWithItsTitle() {
        assertTrue(movie instanceof ChildrenMovie);
    }

    @Test
    public void testChildrenMovieCanCalculateItsRentalCharge() {
        double expectedCharge = 4.5;
        assertEquals(expectedCharge, movie.calculateRentalCharge(DAYS_RENTED), DELTA);
    }

    @Test
    public void testChildrenMovieCanCalculateTheFrequentRenterPoints() {
        int expectedRenterPoints = 1;
        assertEquals(expectedRenterPoints, movie.calculateRenterFrequentPoints(DAYS_RENTED));
    }
}
