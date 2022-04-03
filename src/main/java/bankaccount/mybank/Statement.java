package bankaccount.mybank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * <p>Statement. </p>
 * 
 */
public final class Statement {
    
    private final List<StatementItem> statementItems = new ArrayList<>();

    /**
     * getStatementItems.
     *
     * @return
     */
    public List<StatementItem> getStatementItems() {
        return Collections.unmodifiableList(this.statementItems);
    }
    
    
    /**
     * addTransaction.
     *
     * @param transaction
     */
    public void addTransaction(final Transaction transaction) {
        this.statementItems.add(new StatementItem(transaction, this.getBalance() + transaction.getAmount()));
    }
    
    
    /**
     * getBalance.
     *
     * @return
     */
    public double getBalance() {
        return this.statementItems.isEmpty() ? 0 : this.statementItems.get(this.statementItems.size() - 1).getBalance();
        
    } 
    
    /**
     * print.
     *
     * @return
     */
    public String print() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append("Operation ").append("       Date ").append("         Amount ").append("  Balance ").append("\n");
        
        for (final StatementItem statementItem : this.statementItems) {
            sb.append(statementItem.getTransaction().getOperation()).append(" ");
            sb.append(statementItem.getTransaction().getDate()).append(" ");
            sb.append(statementItem.getTransaction().getAmount()).append(" ");
            sb.append(statementItem.getBalance());
            sb.append("\n");
        }
        return sb.toString();
    }
  

}
