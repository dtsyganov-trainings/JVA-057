package com.luxoft.cdi.example19;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Loggable(debug = true)
@Interceptor
public class LoggingDebugInterceptor {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @AroundInvoke
    private Object intercept(InvocationContext ic) throws Exception {
        logger.info("Debbugger logs interception");
        try {
            return ic.proceed();
        } finally {
            logger.info("Debbugger logged message");
        }
    }

}
