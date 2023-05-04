package calculator;
;

public class Logger implements Loggable {
    @Override
    public void SeeLogs(String operation) {
        System.out.println(operation);
    }
}
