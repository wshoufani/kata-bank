package bankaccount.mybank;

import java.time.LocalDateTime;


/**
 * <p>Account. </p>
 *
 */
public final class Account {

    private final Statement statement = new Statement();
    
    /**
     * deposit.
     *
     * @param aAmount
     * @param aDate
     * @return
     */
    public Account deposit(final double aAmount, final LocalDateTime aDate) {
        this.statement.addTransaction(new Transaction(aAmount, aDate));
        return this; 
    }
    
    
    /**
     * deposit.
     *
     * @param aAmount
     * @return
     */
    public Account deposit(double aAmount) {
        deposit(aAmount, LocalDateTime.now());
        return this;
    }
    
    
    /**
     * withdraw.
     *
     * @param aAmount
     * @param aDate
     * @return
     */
    public Account withdraw(double aAmount, LocalDateTime aDate) {
        this.statement.addTransaction(new Transaction(-aAmount, aDate));
        return this;
    }
    
    /**
     * withdraw.
     *
     * @param aAmount
     * @return
     */
    public Account withdraw(double aAmount) {
        withdraw(aAmount, LocalDateTime.now());
        return this;
    }

    /**
     * getStatement.
     *
     * @return
     */
    public Statement getStatement() {
        return this.statement;
    }

    
}
