package org.csystem.sample.calculator.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleCalculator {
    //Operationları tutacak.
    private  List<IOperation> m_operations;

    public SimpleCalculator(List<IOperation> operations) //elemanları IOperation yani operation olan bir liste gelicek
    {
        m_operations = operations; //artık elinde bir collection var bu nesne için bu calculator için.
    }

    public void calculate(char op, int val1, int val2)
    {
        //operation ne ise onu uygulayacak.
        //İşte bu noktada eğer bir collection içeride tutsa ve operation'ı oradan çekse fikri akla gelmeli.
        for (IOperation operation : m_operations) //dolaşırken tüm collection veri yapısını
            if (operation.isValid(op)) { //valid ise
                System.out.println(operation.doOperation(val1, val2));
                return;
            }

        throw new IllegalArgumentException("Invalid operation");

    }
}
