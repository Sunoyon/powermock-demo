package org.hs.mock;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "org.hs.*")
// @PrepareForTest(DemoUtil.class)
public class DemoImplTest {

    @Test
    public void useDemoStaticMethodTest() { // throws Exception {
        PowerMockito.mockStatic(DemoUtil.class); // For mocking static functions
        Mockito.when(DemoUtil.demoStaticMethod(1)).thenReturn(1);

        DemoImpl demoImpl= new DemoImpl();

        assertEquals(demoImpl.useDemoStaticMethod(),"function executed successfully");
    }
}