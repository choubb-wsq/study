package com.example.cn.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitMQConfiguration {

    /*
    * 发布订阅模式的交换机
    * */
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanout_exchange", true, false);
    }

    /*
    * 路由模式的交换机
    * */
    @Bean
    public DirectExchange directExchange() { return new DirectExchange("direct_exchange", true, false); }

    /*
    * 队列
    * */
    @Bean
    public Queue emailQueue(){
        Map<String,Object> map = new HashMap<String,Object>();
        return new Queue("email.fanout.queue",true, false, false, map);
    }

    /*
    * 交换机与队列间的绑定
    * */
    @Bean
    public Binding emailBinding(){
        //路由模式 BindingBuilder.bind(emailQueue()).to(directExchange()).with("routingkey")
        return BindingBuilder.bind(emailQueue()).to(fanoutExchange());
    }
}
