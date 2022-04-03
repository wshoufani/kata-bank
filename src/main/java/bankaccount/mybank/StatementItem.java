package bankaccount.mybank;

/**
 * <p>StatementItem. </p>
 *
 */
public final class StatementItem {
    
    private final Transaction transaction;
    private final double balance;
    
    /**
     * Constructor.
     *
     * @param aTransaction
     * @param aBalance
     */
    public StatementItem(final Transaction aTransaction, final double aBalance) {
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
    public double getBalance() {
        return this.balance;
    }
    
}
