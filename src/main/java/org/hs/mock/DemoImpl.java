package org.hs.mock;

public class DemoImpl {
    public String useDemoStaticMethod() {
        DemoUtil.demoStaticMethod(1);
        return "function executed successfully";
    }
}