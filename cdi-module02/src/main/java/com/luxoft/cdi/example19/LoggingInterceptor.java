package com.luxoft.cdi.example19;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Loggable(debug = false)
@Interceptor
public class LoggingInterceptor {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        logger.info("Regular logger works!");
        try {
            return ic.proceed();
        } finally {
            logger.info("Regular logger finishes!");
        }
    }
}
