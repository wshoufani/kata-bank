package bankaccount.mybank;

import java.math.BigDecimal;

/**
 * <p>StatementItem. </p>
 *
 */
public final class StatementItem {
    
    private final Transaction transaction;
    private final BigDecimal balance;
    
    /**
     * Constructor.
     *
     * @param aTransaction
     * @param aBalance
     */
    public StatementItem(final Transaction aTransaction, final BigDecimal aBalance) {
        super();
        this.transaction = aTransaction;
        this.balance = aBalance;
    }

    /**
     * getTransaction.
     *
     * @return
     */
    public Transaction getTransaction() {
        return this.transaction;
    }

    /**
     * getBalance.
     *
     * @return
     */
    public BigDecimal getBalance() {
        return this.balance;
    }
    
}
