package org.session1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BankAccountOrderedExecutionTest {
    static BankAccount bankAccount = new BankAccount(0,0);

    @Test
    @Order(2)
    void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @Order(1)
    void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
