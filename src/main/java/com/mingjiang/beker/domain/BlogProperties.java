package com.mingjiang.beker.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/13.
 */
@Component

@ConfigurationProperties(prefix = "blogproperties",ignoreUnknownFields = true)
public class BlogProperties {
    @Value("${blogproperties.name}")
    private String name;
    @Value("${blogproperties.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
