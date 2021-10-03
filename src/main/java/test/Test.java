package test;

import io.github.classgraph.ClassGraph;

import io.github.toolfactory.jvm.DefaultDriver;
import io.github.toolfactory.narcissus.Narcissus;

public class Test {

    public static void main(String[] args) {
        System.out.println("jvm-driver: " + new DefaultDriver().getConsulter(Class.class));
        
        System.out.println("\nClassGraph:");
        new ClassGraph().enableAllInfo().scan().getModuleInfo().forEach(m -> System.out.println(m.getName()));
        
        System.out.println("\nNarcissus: " + Narcissus.findClass("java.lang.Class"));
    }

}
