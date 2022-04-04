package bankaccount.mybank;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
        Account account = new Account();

        //Add 100 to Account
        account.deposit(BigDecimal.valueOf(100));
        
        //withdraw 50 from account
        account.withdraw(BigDecimal.valueOf(50));
        
        //print operations history
        System.out.println( "------------------------------------------------");
        System.out.println(account.getStatement().print());
        System.out.println( "------------------------------------------------");
        
    }
}
