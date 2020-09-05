package tech.yiyehu.impl;

import com.alibaba.dubbo.config.annotation.Service;
import tech.yiyehu.service.TestService;

/**
 * @author yiyehu
 * @version 创建时间：2018/7/27 10:33
 */
@Service
public class TestServiceImpl implements TestService {

    public String test(){
        return "test succeed 20001";
    }
}
