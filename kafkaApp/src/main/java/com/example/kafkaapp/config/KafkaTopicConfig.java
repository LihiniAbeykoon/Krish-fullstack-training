package com.example.kafkaapp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic OrderTopic() {
        return TopicBuilder.name("OrderTopic")
                .build();
    }

    @Bean
    public NewTopic AllocationTopic() {
        return TopicBuilder.name("AllocationTopic")
                .build();
    }

    @Bean
    public NewTopic ScheduleTopic() {
        return TopicBuilder.name("ScheduleTopic")
                .build();
    }

    @Bean
    public NewTopic DispatchTopic() {
        return TopicBuilder.name("DispatchTopic")
                .build();
    }

}
