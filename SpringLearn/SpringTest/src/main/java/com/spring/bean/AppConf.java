package com.spring.bean;

import com.spring.dao.CarDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuyong on 16-1-1.
 */
@Configuration
public class AppConf {
    @Bean
    public CarDao carDao() {
        return new CarDao();
    }
}
