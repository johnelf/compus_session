package com.proxy.pattern.dynamicproxy;

public class MovieDownload implements Download{
    @Override
    public String download() {
        System.out.println("downloading movies");
        return "movies";
    }
}
