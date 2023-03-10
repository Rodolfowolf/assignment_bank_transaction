/**
 * Assignment 7 instance 500 objects working with array.
 * @author Rodolfo Carvalho 200536943
 * @date March 10, 2023
 * @time 11:00pm 
 */
public class BankTransactionRecord{
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;

    public BankTransactionRecord(boolean canadiaFunds,double exchangeRate,int transactionNumber,long transactionReferenceNumber){
        this.canadianFunds=canadiaFunds;
        this.exchangeRate=exchangeRate;
        this.transactionNumber=transactionNumber;
        this.transactionReferenceNumber=transactionReferenceNumber;
    }
    public boolean getcanadiaFunds(){
        return canadianFunds;
    }
    public double getexchangeRate(){
        return exchangeRate;
    }
    public int gettransactionNumber(){
        return transactionNumber;
    }
    public long gettransactionReferenceNumber(){
        return transactionReferenceNumber;
    }
    public void setcanadiaFunds(boolean canadianFunds){
        this.canadianFunds=canadianFunds;
    }
    public void setexchangeRate(double exchangeRate){
        this.exchangeRate=exchangeRate;
    }
    public void settransactionNumber(int transactionNumber){
        this.transactionNumber=transactionNumber;
    }
    public void settransactionReferenceNumber(long transactionReferenceNumber){
        this.transactionReferenceNumber=transactionReferenceNumber;
    }

}