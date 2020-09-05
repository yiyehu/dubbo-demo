package tech.yiyehu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiyehu
 * @version 创建时间：2018/7/27 17:29
 */
@RestController
public class TestBaseController {
    @RequestMapping("testBase")
    public String test(){
        return "testBase";
    }
}
