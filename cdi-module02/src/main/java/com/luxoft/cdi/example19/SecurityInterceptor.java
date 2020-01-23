package com.luxoft.cdi.example19;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Security
@Interceptor
public class SecurityInterceptor {
    private Logger logger = Logger.getLogger(SecurityInterceptor.class.getName());

    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        logger.info("Check user rights to execute the operation");
        try {
            return ic.proceed();
        } finally {
            logger.info("User rights verified, successful operation");
        }
    }
}
