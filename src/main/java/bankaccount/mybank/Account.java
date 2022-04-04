package bankaccount.mybank;

import java.math.BigDecimal;
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
    public Account deposit(final BigDecimal aAmount, final LocalDateTime aDate) {
        this.statement.addTransaction(new Transaction(aAmount, aDate));
        return this; 
    }
    
    
    /**
     * deposit.
     *
     * @param aAmount
     * @return
     */
    public Account deposit(BigDecimal aAmount) {
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
    public Account withdraw(BigDecimal aAmount, LocalDateTime aDate) {
        this.statement.addTransaction(new Transaction(aAmount.negate(), aDate));
        return this;
    }
    
    /**
     * withdraw.
     *
     * @param aAmount
     * @return
     */
    public Account withdraw(BigDecimal aAmount) {
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
