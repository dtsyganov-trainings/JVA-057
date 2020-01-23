package com.luxoft.cdi.example18;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.Arrays;
import java.util.logging.Logger;

@Security
@Interceptor
public class SecurityInterceptor {
    private Logger logger = Logger.getLogger(SecurityInterceptor.class.getName());

    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        logger.info("Check user rights to execute the operation");
        try {
            System.out.println(ic.getMethod().getName());
            System.out.println(Arrays.toString(ic.getParameters()));
            return ic.proceed();
        } finally {
            logger.info("User rights verified, successful operation");
        }
    }
}
