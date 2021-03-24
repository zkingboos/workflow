package com.github.zkingboos.workflow;

import lombok.Data;

@Data
public class GradlePipeline {

    private final String name;

    public static void main(String[] args) {
        System.out.println(new GradlePipeline("Hello World!"));
    }
}
