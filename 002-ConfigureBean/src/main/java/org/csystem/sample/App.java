package org.csystem.sample;

import org.csystem.sample.bean.Sample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(App.class, args);

        //context.getBean singleton instance verir yani heap'te bir tane nesne var.(debug yapınız)
        Sample s1 = new Sample();
        var s2 = context.getBean(Sample.class);

        s1.setVal(10);
        s2.setVal(100);

        System.out.println(s1.getVal());
        System.out.println(s2.getVal());
    }
}


