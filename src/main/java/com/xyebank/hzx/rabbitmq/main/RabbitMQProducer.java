package com.xyebank.hzx.rabbitmq.main;

import com.xyebank.hzx.rabbitmq.producer.Producer;
import com.xyebank.hzx.rabbitmq.vo.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by perfection on 16-5-30.
 */
public class RabbitMQProducer {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(
                "classpath:spring-rabbitmq-provider-config.xml");
    }

}
