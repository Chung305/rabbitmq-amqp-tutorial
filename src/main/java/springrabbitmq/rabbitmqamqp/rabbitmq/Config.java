package springrabbitmq.rabbitmqamqp.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import org.springframework.amqp.core.Queue;

@Profile({"tut1", "hello-world"})
@Configuration
public class Config {

    @Bean
    public Queue hello(){
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public MqReceiver receiver(){
        return new MqReceiver();
    }

    @Profile("sender")
    @Bean
    public MqSender sender(){
        return new MqSender();
    }
}
