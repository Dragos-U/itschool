package session_4.practice;
import java.util.logging.Logger;

public class PrintWithLogger {
    private static final Logger logger = Logger.getLogger(TernaryOperator.class.getName());

    public static void main(String[] args) {

        int result = 10;
        logger.info("Result: " + result);
    }
}
