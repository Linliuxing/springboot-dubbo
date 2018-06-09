package com.lin.provider;




import com.alibaba.dubbo.config.annotation.Service;
import com.lin.service.ProviderService;
import org.springframework.stereotype.Component;


/**
 * Created by Administrator on 2018/5/19.
 */
@Service(version = "1.0.0")
@Component
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
