package org.csystem.sample.calculator.operation;

import org.springframework.stereotype.Component;

@Component
public class Addition implements IOperation {

    @Override
    public int doOperation(int val1, int val2)
    {
        return val1 + val2;
    }

    @Override
    public boolean isValid(char op)
    {
        return op == '+';
    }

    public String toString()
    {
        return "Hello from Addition";
    }
}

//Artık IOperation beklenen yerde Addition nesnesi geçilebilir.
//Aşağıdan yukarıya atama doğrudan olduğundan class-cast-exception olmaz.
//Dinamik türün metotlarına soyutluk javada önce çağrı yapıldığından buradaki override edilmiş calc metodu çağrılır.