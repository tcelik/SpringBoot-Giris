package org.csystem.sample.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component //artık singleton instance alınabilir context ile
public class Sample {
    private int m_val;


    public int getVal()
    {
        return m_val;
    }

    public void setVal(int val)
    {
        m_val = val;
    }

    public Sample getSample()
    {
        return new Sample();
    }
}
