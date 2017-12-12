// App.java:
package com.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http://saltnlight5.blogspot.com/2013/08/how-to-configure-slf4j-with-different.html
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("main:" + logger.isDebugEnabled() + "," + logger.isErrorEnabled());
        logger.debug("Hello world.");
        logger.debug("one line");
        logger.info("info");
        logger.error("error");
        logger.error("测试下中文");
    }
}
