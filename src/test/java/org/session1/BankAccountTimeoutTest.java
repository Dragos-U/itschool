package org.session1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountTimeoutTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testDepositTimeoutAssertion(BankAccount bankAccount){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        bankAccount.deposit(300);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    void testDepositTimeoutAnnotation(BankAccount bankAccount){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        bankAccount.deposit(300);
        assertTimeout(Duration.ofMillis(500), ()->{Thread.sleep(10);});

    }
}
