package calculator;

public class CalcDecorator implements Calculable {
    Calculable calc;
    Loggable log;

    public CalcDecorator(Calculable calculable, Loggable loggable) {
        this.calc = calculable;
        this.log = loggable;
    }

    @Override
    public Calculable sum(int arg) {
        log.SeeLogs(String.format("Суммирую %d с %d",calc.getResult(), arg));
        Calculable res = calc.sum(arg);
        log.SeeLogs(String.format("Получаем результат %d", res.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        log.SeeLogs(String.format("Умножаю %d с %d",calc.getResult(), arg));
        Calculable res = calc.multi(arg);
        log.SeeLogs(String.format("Получаем результат %d", res.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}
