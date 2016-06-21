package comp.fundacionjala.movies;

public interface IMovie {

    double calculateRentalCharge(int daysRented);

    int calculateRenterFrequentPoints(int daysRented);

    String getTitle();
}
