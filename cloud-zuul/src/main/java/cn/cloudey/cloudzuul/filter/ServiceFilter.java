package cn.cloudey.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 張燿峰
 * <p>服务过滤,安全验证</p>
 * @author 孤
 * @date 2018/12/28
 * @Varsion 1.0
 */
@Component
@Slf4j
public class ServiceFilter extends ZuulFilter {

    /**
     * <p>返回一个字符串代表过滤器的类型，
     * 在zuul中定义了四种不同生命周期的过滤器类型</p>
     * @return pre:路由之前,routing:路由之时,post:路由之后,error:发生错误后调用
     */
    @Override
    public String filterType() {
        return "pre";
    }


    /**
     * <p>过滤的顺讯</p>
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤
     * @return true:永远过滤,false:不过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * <p>过滤器的具体实现</p>
     * @return 自定义
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //初始化上下文
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object token = request.getParameter("token");
        if (token==null){
            log.warn("Token Not Found");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("Token Not Found");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        log.info("Token OK");
        return null;
    }
}
