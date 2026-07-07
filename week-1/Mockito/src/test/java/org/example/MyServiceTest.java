package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void TestData(){
        ExternalApi api=mock(ExternalApi.class);
        when(api.getData()).thenReturn("Hello Nikhil");
        MyService service= new MyService(api);

        String res=service.fetchData();
        assertEquals("Hello Nikhil",res);
        verify(api).getData();
    }
}
