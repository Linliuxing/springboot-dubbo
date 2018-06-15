package com.lin.provider;




import com.alibaba.dubbo.config.annotation.Service;
import com.lin.service.NumService;
import com.lin.service.ProviderService;
import org.springframework.stereotype.Component;


/**
 * Created by Administrator on 2018/5/19.
 */
@Service(version = "2.0.0")
@Component
public class ProviderServiceImpl implements NumService {
    @Override
    public int sum(int i) {
        return i*5;
    }
}
