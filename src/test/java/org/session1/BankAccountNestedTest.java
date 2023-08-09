package org.session1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountNestedTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.withdraw(300);
        assertEquals(200,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance());
    }

    @Nested // allows a better grouping of the unit tests
    class WhenBalanceEqualsZero{
        @Test
        @DisplayName("Withdrawing below minimum balance: exception")
        void testWithdrawMinimumBalanceIs0(){
            BankAccount bankAccount = new BankAccount(0,0);
            assertThrows(RuntimeException.class, ()->bankAccount.withdraw(500));

        }

        @Test
        @DisplayName("Withdrawing and getting a negative balance")
        void testWithdrawMinimumBalanceNegative1000(){
            BankAccount bankAccount = new BankAccount(0,-1000);
            bankAccount.withdraw(500);
            assertEquals(-500,bankAccount.getBalance());
        }
    }
}
