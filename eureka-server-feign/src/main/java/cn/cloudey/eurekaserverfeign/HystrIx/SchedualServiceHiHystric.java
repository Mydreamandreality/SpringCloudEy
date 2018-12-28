package cn.cloudey.eurekaserverfeign.HystrIx;

import cn.cloudey.eurekaserverfeign.FeignService.SchedualService;
import org.springframework.stereotype.Component;

/**
 * Created by 張燿峰
 * <p>断路器解释:在服务调用的Service注解中添加fallback指定类路径
 * fallback指定的类需要实现当前接口,并且注入到IOC中</p>
 * @author 孤
 * @date 2018/12/28
 * @Varsion 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualService {
    @Override
    public String sayHiClient(String name) {
        return "sorry "+name;
    }
}
