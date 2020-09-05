package tech.yiyehu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.yiyehu.service.TestService;

/**
 * @author yiyehu
 * @version 创建时间：2018/7/27 13:51
 */
@RestController
public class TestController {

    @Reference
    TestService testService;

    @GetMapping("test")
    public String test(){
        return testService.test();
    }
}
