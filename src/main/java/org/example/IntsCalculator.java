package org.example;

public class IntsCalculator implements Ints {
    protected Calculator calculator = new Calculator();
    private int res;

    @Override
    public int sum(int arg0, int arg1) {
        res = (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return res;
    }

    @Override
    public int mult(int arg0, int arg1) {
        res = (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return res;
    }

    @Override
    public int pow(int a, int b) {
        res = (int) calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return res;
    }
}
