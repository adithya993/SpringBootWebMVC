package org.practiceprojects.ProductDemoSpringWeb.Model;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    @Before("execution(public * org.practiceprojects.ProductDemoSpringWeb.Controller.ProductController.getAllProducts())")
    public void logBefore(){
        System.out.println("Before calling getAllProducts() methods");
        LOGGER.info("Before calling getAllProducts() methods");
    }

    // only work on successful execution
    @AfterReturning("execution(public * org.practiceprojects.ProductDemoSpringWeb.Controller.ProductController.getAllProducts())")
    public void logAfter(){
        LOGGER.info("After successful calling getAllProducts() methods");
    }

    // only work on encountering exception
    @AfterThrowing("execution(public * org.practiceprojects.ProductDemoSpringWeb.Controller.ProductController.getAllProducts())")
    public void logException(){
        LOGGER.info("After exception in getAllProducts() methods");
    }
}
