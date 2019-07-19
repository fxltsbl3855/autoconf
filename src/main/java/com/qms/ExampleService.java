package com.qms;

/**
 * @Description TODO
 * @Author ycl
 * @Date 2019/7/19 13:09
 * @Version 1.0
 **/
public class ExampleService {

    private String profix;
    private String suffix;


    public ExampleService(String profix, String suffix) {
        System.out.println("ExampleService cons....profix="+profix+",suffix="+suffix);
        this.profix = profix;
        this.suffix = suffix;
    }
    public String wrap(String value) {
        return profix+"["+value+"]"+suffix;
    }
}
