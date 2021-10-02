package test;

import io.github.toolfactory.jvm.DefaultDriver;
import io.github.toolfactory.jvm.Driver;
import io.github.toolfactory.narcissus.Narcissus;

public class Test {

    public static void main(String[] args) {
        Driver driver = new DefaultDriver();
        driver.getConsulter(Class.class);
        
        Narcissus.findClass("java.lang.Class");
    }

}
