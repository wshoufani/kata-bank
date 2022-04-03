package bankaccount.mybank;

import java.time.LocalDateTime;

/**
 * <p>Transaction. </p>
 * 
 */
public final class Transaction {
    
    public static final String DEPOSIT = "DEPOSIT";
    public static final String WITHDRAWAL = "WITHDRAWAL";

    private final double amount;
    private final LocalDateTime date;
    private final String operation;
    
    /**
     * Constructor.
     *
     * @param aAmount
     * @param aDate
     */
    public Transaction(final double aAmount, final LocalDateTime aDate) {
        super();
        this.amount = aAmount;
        this.date = aDate;
        this.operation = (aAmount >= 0) ? DEPOSIT : WITHDRAWAL;
    }

    /**
     * getAmount.
     *
     * @return
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * getDate.
     *
     * @return
     */
    public LocalDateTime getDate() {
        return this.date;
    }
    
    /**
     * getOperation.
     *
     * @return
     */
    public String getOperation() {
        return this.operation;
    }

}
