package comp.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RentalTest {

    @Test
    public void aRentalInstanceIsNotNull() {
        IMovie movie = new RegularMovie("title");
        assertNotNull(new Rental(movie, 1));
    }

    @Test
    public void aRentalInstanceCanBeCreatedWithAMovieAndDaysRented() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        assertTrue(rental instanceof Rental);
    }
    
    @Test
    public void theDaysRentedCanBeUpdated() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        rental.setDaysRented(4);
        assertEquals(4, rental.getDaysRented());
    }

    @Test
    public void daysRentedCanBeExtracted() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        assertEquals(2, rental.getDaysRented());
    }

    @Test
    public void theMovieInstanceCanBeExtracted() {
        IMovie movie = new RegularMovie("title");
        Rental rental = new Rental(movie, 2);
        assertTrue(rental.getMovie() instanceof Movie);
    }
}
