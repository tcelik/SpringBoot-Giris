package org.csystem.sample.calculator.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Multiplication implements IOperation{
    private Addition m_addition;

    //Bunuda yakalar. ekstradan
    public Multiplication(Addition addition)
    {
        m_addition = addition;
    }

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
        System.out.println(m_addition.toString() + "here");
        return "Hello from Multiplication operation";
    }
}
