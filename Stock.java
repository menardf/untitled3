/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 3/8/18
 * Time: 10:35 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class Stock {
    String stockname;

    String abbreviation[];


    String pricepershare;
    int numshares;
    int dividend;

    public String getStockname() {
        return stockname;
    }

    public int getNumshares() {
        return numshares;
    }

    public String getPricepershare() {
        return pricepershare;
    }

    public String[] getAbbreviation() {
        return abbreviation;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public void setNumshares(int numshares) {
        this.numshares = numshares;
    }

    public void setPricepershare(String pricepershare) {
        this.pricepershare = pricepershare;
    }

    public int getDividend() {
        return dividend;
    }

    public void setAbbreviation(String[] abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public int totaldiv(int numshares, int dividend ){

        int total = numshares*dividend;
        return total;
    }
}
