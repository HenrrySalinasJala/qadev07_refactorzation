package comp.fundacionjala.movies;

class Movie {

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {

        this.priceCode = priceCode;
        this.title = title;
    }

    public int getPriceCode() {

        return priceCode;
    }

    public void setPriceCode(int arg) {

        priceCode = arg;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }
}
