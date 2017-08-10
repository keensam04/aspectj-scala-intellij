package com.component;

import org.junit.Test;
import sample.component.SampleComponent;

public class InterceptionTest {

    private SampleComponent component = new SampleComponent() ;

    @Test
    public void componentInterceptsWithoutException(){
              component.interceptMe("hello world");
    }

}
