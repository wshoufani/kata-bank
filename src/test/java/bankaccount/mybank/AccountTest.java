package bankaccount.mybank;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class AccountTest {
	
	/**
     * should_return_statement_balance_100_when_i_deposit_100.
     *
     */
    @Test
    public void should_return_statement_balance_100_when_i_deposit_100() {
        final BigDecimal aDepositOf100 = BigDecimal.valueOf(100);
        final Account account = new Account();
        final Account expectedAccount = account.deposit(aDepositOf100);
        assertThat(expectedAccount.getStatement().getBalance()).isEqualTo(aDepositOf100);
        assertThat(expectedAccount).isNotNull();
    }
    

    /**
     * should_return_statement_balance_50_when_i_deposit_100_and_i_withdraw_50.
     *
     */
    @Test
    public void should_return_statement_balance_50_when_i_deposit_100_and_i_withdraw_50() {
        final Account account = new Account();
        final Account expectedAccount = account.deposit(BigDecimal.valueOf(100)).withdraw(BigDecimal.valueOf(50));
        assertThat(expectedAccount.getStatement().getBalance()).isEqualTo(BigDecimal.valueOf(50));
        assertThat(expectedAccount).isNotNull();
    }
    
    /**
     * should_return_statement_balance_minus_50_when_i_withdraw_50.
     *
     */
    @Test
    public void should_return_statement_balance_minus_50_when_i_withdraw_50() {
        final Account account = new Account();
        final Account expectedAccount = account.withdraw(BigDecimal.valueOf(50));
        assertThat(expectedAccount.getStatement().getBalance()).isEqualTo(BigDecimal.valueOf(-50));
        assertThat(expectedAccount).isNotNull();
    }
    
    
    /**
     * should_return_statement_items_size_2_and_balance_50_when_i_deposit_100_and_i_withdraw_50.
     *
     */
    @Test
    public void should_return_statement_items_size_2_and_balance_50_when_i_deposit_100_and_i_withdraw_50() {
        final Statement statement = new Account().deposit(BigDecimal.valueOf(100)).withdraw(BigDecimal.valueOf(50)).getStatement();
        assertThat(statement.getBalance()).isEqualTo(BigDecimal.valueOf(50));
        assertThat(statement.getStatementItems().size()).isEqualTo(2);
    }
}
