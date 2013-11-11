package com.proxy.pattern.dynamicproxy;

public class MusicDownload implements Download {
    @Override
    public String download() {
        System.out.println("downloading music...");
        return "music";
    }
}
