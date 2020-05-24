package com.imooc.ad.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    //配置统一的消息转换器

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>>
                                                       converters) {
        //很细节，因为是list，说明有很多转换器，先全部清除，再添加自己需要的！
        converters.clear();
        //需要json的消息转换器，即修改一处配置从而影响全局
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
