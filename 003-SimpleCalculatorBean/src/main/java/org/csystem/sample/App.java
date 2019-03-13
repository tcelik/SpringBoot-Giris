package org.csystem.sample;

import org.csystem.sample.calculator.operation.Addition;
import org.csystem.sample.calculator.operation.IOperation;
import org.csystem.sample.calculator.operation.Multiplication;
import org.csystem.sample.calculator.operation.SimpleCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        /*

            Spring olmasaydı basitçe şöyle olucaktı.

            List<IOperation> operations = Arrays.asList(new Addition(), new Multiplication());

            //Artık öyle bir calc nesnemiz varki operasyonları bir listede tutuyor
            SimpleCalculator calculator = new SimpleCalculator(operations);

            calculator.calculate('+', 10, 10);
            calculator.calculate('*', 10, 10);

        */

        //AMA SPRING VAR

        /*
              context al dependecny injection için işaretleri koy.
              spring nesneleri kendisi alsın.

              Bu arada java'da artık var'da var. Ne işe yarar? Örneği run ne döndüğünü bilmemiz gerekiyor dökümana bakıp
              tabi doğruda Object atama diye bir kültürünüz yoksa:)

              var ile bilmen gerekmiyor.
        */

        var contextAl = SpringApplication.run(App.class, args);

        //new SimpleCalculator() yapıcak sonuçta ve başlangıç metotuna elemanları IOperation türünden olan
        //bir liste geçmesi gerekecek bu noktada Component ile işaretleyenelere bakıyor.
        //Addition ve Multiplication component ile işaretlenmeli.
        //İşte listeyi kendisi auto-wired geçicek. Bunlar framework'ün sorumluluğunda.
        SimpleCalculator calculator = contextAl.getBean(SimpleCalculator.class);

        //madem nesneyi aldı non-static metotlarına çağrı yapabilirim.
        calculator.calculate('+', 10, 10);
        calculator.calculate('*', 10, 10);

        //debug yapınız. ekstra
        System.out.println(calculator.getOperations().get(1).toString());;
    }
}


