package org.session1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
class BankAccountDITest {
    @Test
    @DisplayName("Deposit 400 successfully")
    void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
