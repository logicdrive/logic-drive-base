package base.domain.baseTask;

import base._global.event.BaseCreated;
import base._global.logger.CustomLogger;
import base._global.logger.CustomLoggerType;

public class LogCreatedBaseTask {
    
    public static void logCreatedBaseTask(BaseCreated baseCreated) {
        CustomLogger.debug(
            CustomLoggerType.EFFECT,
            String.format(String.format("Log BaseCreated: %s", baseCreated.toString()))
        );
    }

}
