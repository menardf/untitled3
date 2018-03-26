/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 3/8/18
 * Time: 10:35 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class Stock {
    Stock T;
    String stockname;

    String[] abbreviation=new String[4];


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
    public int totaldivident(Stock T){
        int totaldivident;
        totaldivident= T.getNumshares()*T.getDividend();
        return totaldivident;

    }

    public static void main(String[] args){
        Stock A= new Stock();
        A.setNumshares(10);
        A.setDividend(20);

        System.out.println(A.totaldivident(A) );

    }


}










