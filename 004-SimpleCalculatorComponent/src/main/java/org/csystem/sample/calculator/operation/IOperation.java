package org.csystem.sample.calculator.operation;

import org.springframework.stereotype.Component;

//Benim anlaşmam
public interface IOperation {
    int doOperation(int val1, int val2);

    //hangi operasyon yapıldığı bilgisi için konuldu.
    boolean isValid(char op);
}
