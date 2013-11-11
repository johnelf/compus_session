package com.proxy.pattern.dynamicproxy;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DownloadProxyTest {
    private MovieDownload movieDownload;
    private MusicDownload musicDownload;

    @Before
    public void setup() {
        movieDownload = new MovieDownload();
        musicDownload = new MusicDownload();
    }

    @Test
    public void should_download_movie_successful() {
        InvocationHandler downloadHandler = new DynamicProxy(movieDownload);

        Download downloader = (Download) Proxy.newProxyInstance(downloadHandler.getClass().getClassLoader(),
                movieDownload.getClass().getInterfaces(),
                downloadHandler);

        downloader.download();
    }
}
