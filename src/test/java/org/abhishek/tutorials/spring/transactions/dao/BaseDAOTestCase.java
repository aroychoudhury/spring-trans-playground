package org.abhishek.tutorials.spring.transactions.dao;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Base class for DAO TestCases.
 *
 * @author Matt Raible
 */
public class BaseDAOTestCase extends TestCase {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    protected ApplicationContext ctx = null;

    public BaseDAOTestCase() {
        try {
            String[] paths = {"application-context.xml"};
            ctx = new ClassPathXmlApplicationContext(paths);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}