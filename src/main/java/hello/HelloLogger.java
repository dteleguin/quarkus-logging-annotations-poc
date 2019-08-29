package hello;

import org.jboss.logging.Logger;
import static org.jboss.logging.Logger.Level.INFO;
import org.jboss.logging.annotations.LogMessage;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageLogger;

@MessageLogger(projectCode="HELLO", length=4)
public interface HelloLogger {

    HelloLogger LOGGER = Logger.getMessageLogger(HelloLogger.class, "hello");

    @LogMessage(level = INFO)
    @Message(id=1, value="Hello %s")
    void hello(Object object);

}
