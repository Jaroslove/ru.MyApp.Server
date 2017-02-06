package ru.MyApp.Server.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by 1 on 06.02.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ru.MyApp.Server")
public class WebConfig extends WebMvcConfigurerAdapter{

}
