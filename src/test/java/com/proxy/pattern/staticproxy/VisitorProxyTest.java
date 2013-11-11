package com.proxy.pattern.staticproxy;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;

public class VisitorProxyTest {
    private VisitorProxy visitorProxy;
    private Comment comment;

    @Before
    public void setup() {
        comment = new WriteComment();
        visitorProxy = new VisitorProxy(comment);
    }

    @Test
    public void should_write_comment_successfully() {
        assertTrue(visitorProxy.writeComment("ThoughtWorks"));
    }
}
