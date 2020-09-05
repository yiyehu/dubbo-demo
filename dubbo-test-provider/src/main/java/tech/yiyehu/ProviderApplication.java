package tech.yiyehu;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author yiyehu
 * @version 创建时间：2018/7/27 10:43
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
        System.in.read();
    }
}
