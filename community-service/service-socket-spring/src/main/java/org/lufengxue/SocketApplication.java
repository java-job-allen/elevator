package org.lufengxue;

import lombok.extern.slf4j.Slf4j;
import org.lufengxue.constant.LogConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : Allen
 * @date : 2022/05/12 16:42
 * @desc : 实时通信服务启动类
 */
@Slf4j
@SpringBootApplication
public class SocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(SocketApplication.class, args);
        log.info(LogConstant.PUN_FINISH,"通信模块启动成功");
    }
}
