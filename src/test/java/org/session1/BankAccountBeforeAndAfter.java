package org.session1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountBeforeAndAfter {
    static BankAccount bankAccount;

    @BeforeAll
    static void prepTest(){
        BankAccount bankAccount = new BankAccount(500,0);
    }

    @Test
    void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(700, bankAccount.getBalance());
    }

    @AfterAll
    static void endTest(){
        System.out.println("Bye!");
    }

}
