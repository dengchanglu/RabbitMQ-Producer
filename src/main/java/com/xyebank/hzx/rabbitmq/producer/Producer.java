package com.xyebank.hzx.rabbitmq.producer;

import com.xyebank.hzx.rabbitmq.utils.FastJsonMessageConverter;
import com.xyebank.hzx.rabbitmq.utils.JsonUtils;
import com.xyebank.hzx.rabbitmq.vo.Message;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by perfection on 16-5-30.
 */
@Service
public class Producer {
    @Autowired
    private AmqpTemplate messageQueue;

    private final AtomicInteger counter = new AtomicInteger();

    @Autowired
    private FastJsonMessageConverter fastJsonMessageConverter;

    @Scheduled(fixedRate = 1000000)
    public void execute() {
        Message message = new Message();
        message.setProductId(Long.parseLong("123456789"));
        message.setVersion(1);
        message.setApplyId(Long.parseLong("1531605230000059"));
        messageQueue.convertAndSend("queueTestKey", (message));

        System.out.println("发送成功+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
