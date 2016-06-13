package comp.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class NewReleaseMovieTest {

    @Test
    public void aNewReleaseMovieInstanceIsNotNull() {
        assertNotNull(new NewReleaseMovie("new movie title"));
    }

    @Test
    public void aNewReleaseMovieCanBeCreatedOnlyWithItsTitle() {
        NewReleaseMovie movie = new NewReleaseMovie("new movie title");
        assertTrue(movie instanceof NewReleaseMovie);
    }

    @Test
    public void aNewReleaseMovieCanCalculateItsRentalCharge() {
        IMovie movie = new NewReleaseMovie("children title movie");
        assertEquals(15, movie.calculateRentalCharge(5), 00000000001);
    }

    @Test
    public void aNewReleaseMovieCanCalculateTheFrequentRenterPoints() {
        NewReleaseMovie movie = new NewReleaseMovie("title");
        assertEquals(2, movie.calculateRenterFrequentPoints(10));
    }
}
