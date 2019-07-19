package com.qms;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description TODO
 * @Author ycl
 * @Date 2019/7/19 13:42
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "com.qms.autoconfigure")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
