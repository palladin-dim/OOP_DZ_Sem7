package calculator;

public class LogFactory implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
        return new CalcDecorator(new Calculator(primaryArg), new Logger());
    }
}
