package bankaccount.mybank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>Transaction. </p>
 * 
 */
public final class Transaction {
    
    public static final String DEPOSIT = "DEPOSIT";
    public static final String WITHDRAWAL = "WITHDRAWAL";

    private final BigDecimal amount;
    private final LocalDateTime date;
    private final String operation;
    
    /**
     * Constructor.
     *
     * @param aAmount
     * @param aDate
     */
    public Transaction(final BigDecimal aAmount, final LocalDateTime aDate) {
        super();
        this.amount = aAmount;
        this.date = aDate;
        this.operation = (aAmount.compareTo(BigDecimal.ZERO) > 0) ? DEPOSIT : WITHDRAWAL;
    }

    /**
     * getAmount.
     *
     * @return
     */
    public BigDecimal getAmount() {
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
