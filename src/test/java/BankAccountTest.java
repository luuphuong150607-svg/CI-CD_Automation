import org.example.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void testDepositSucccess() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(500.0);
        assertEquals(600.0, account.getBalance(), "So du phai la 600.0 sau khi nap 500.0");
    }

    @Test
    void testDepositNegativeAmountThrowsException() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-190.2);
        });
        assertEquals("So tien nap phai lon hon 0", exception.getMessage());
    }
}
