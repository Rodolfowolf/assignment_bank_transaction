/**
 * Assignment 7 instance 500 objects working with array.
 * @author Rodolfo Carvalho 200536943
 * @date March 10, 2023
 * @time 11:00pm 
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class BankTransactionRecordTestHarness{
      public static void main(String []args){
        Scanner prompt = new Scanner(System.in);//Scan object
        char opt = 'y';
        int cont = 0;

        Random random = new Random();
        ArrayList<BankTransactionRecord> list = new ArrayList<>();
        
        do{
        for(int i=0;i<501;i++){
            BankTransactionRecord client = new BankTransactionRecord(random.nextBoolean(),random.nextDouble(),random.nextInt(),random.nextLong());
            list.add(client);
        }
        System.out.println("Bank Transaction");
        System.out.println("(-----------------------------------)");
        System.out.println("");
        for(int i=0;i<501;i++){
        Boolean funds = list.get(i).getcanadiaFunds();
        double rate = list.get(i).getexchangeRate();
        int number = list.get(i).gettransactionNumber();
        long reference = list.get(i).gettransactionReferenceNumber();
        
        System.out.println("Operation: "+i);
        System.out.println("Canadia Funds: "+funds);
        System.out.println("Exchange rete: "+rate);
        System.out.println("Transaction number: "+number);
        System.out.println("Transaction reference: "+reference);
        System.out.println("");
        System.out.println("(-----------------------------------)");
        System.out.println("");
        }
        cont=cont+1;
        System.out.println("Phase "+cont+" finished, Would you like to continue to phase "+ (cont+1)+" (Y|N): ");//User input
        //System.out.println("Would you like to continue (Y|N): ");//User input
        opt = (prompt.nextLine().charAt(0));//User input record
    }while(opt == 'y' || opt == 'Y');
    System.out.println("Operation finished in phase "+cont);
        }
        
      }
    