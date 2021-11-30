package com.jacky.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/30
 * @Content:
 */
@ConfigurationProperties("jacky.hello")
public class HelloProperties {
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
