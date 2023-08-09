package org.session1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class BankAccountAssumptionsTest {

    @Test
    @DisplayName("Test activation after creation")
    void testActive(){
        BankAccount bankAccount = new BankAccount(500,0);
        assumingThat(bankAccount!=null, ()-> assertTrue(bankAccount.isActive()));
//        assumeTrue(bankAccount== null,"Account is null");
//        assertTrue(bankAccount.isActive());
    }
}
