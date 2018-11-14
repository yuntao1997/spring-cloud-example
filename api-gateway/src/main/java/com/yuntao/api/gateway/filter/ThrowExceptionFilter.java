package com.yuntao.api.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.cloud.netflix.zuul.filters.route.RibbonRoutingFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * ${DESCRIPTION}
 *
 * @author yuntao.zhou
 * @version 1.0
 * @create 2018-11-13 15:26
 */
public class ThrowExceptionFilter extends ZuulFilter {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        log.info("This is a pre filter, it will throw a RuntimeException");
        RequestContext ctx = RequestContext.getCurrentContext();
        /**
         * 参见 {@link SendErrorFilter#findZuulException()} 获取exception的代码，{@link RibbonRoutingFilter#run()} 设置异常的代码。
         * 如果不进行try catch，并抛出 {@link ZuulException} ，将不会显示异常信息
         */
        try {
            doSomething();
        } catch (Exception e) {

            throw new ZuulException(e, 500, "test error handle");
        }
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors ... ");
    }
}
