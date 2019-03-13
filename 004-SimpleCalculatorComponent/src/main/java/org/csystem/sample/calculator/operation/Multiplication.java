package org.csystem.sample.calculator.operation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Multiplication implements IOperation{
    @Override
    public int doOperation(int val1, int val2)
    {
        return val1 * val2;
    }

    @Override
    public boolean isValid(char op)
    {
        return op == '*';
    }

    public String toString()
    {
        return "Hello from Multiplication operation";
    }
}
