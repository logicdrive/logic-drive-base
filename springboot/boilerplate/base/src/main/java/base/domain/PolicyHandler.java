package base.domain;

import javax.transaction.Transactional;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import base._global.config.kafka.KafkaProcessor;
import base._global.event.BaseCreated;
import base._global.logger.CustomLogger;
import base._global.logger.CustomLoggerType;

@Service
@Transactional
public class PolicyHandler {
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BaseCreated'"
    )
    public void wheneverBaseCreated_LogCreatedBase(
        @Payload BaseCreated baseCreated
    ) {
        try
        {

            CustomLogger.debug(CustomLoggerType.ENTER, "", String.format("{%s: %s}", baseCreated.getClass().getSimpleName(), baseCreated.toString()));
            Base.logCreatedBase(baseCreated);
            CustomLogger.debug(CustomLoggerType.EXIT);

        } catch(Exception e) {
            CustomLogger.error(e, "", String.format("{%s: %s}", baseCreated.getClass().getSimpleName(), baseCreated.toString()));
        }
    }
}
