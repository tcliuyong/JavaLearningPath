package tcliuyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.util.FileSystemUtils;

import java.io.File;

/**
 * Created by liuyong on 2016/3/11.
 */
/**
 * This is also known as a message driven POJO. As you can see in the code above, there is no need to implement any particular interface or for the method to have any particular name. Besides, the method may have a very flexible signature; in our simple example we will just extract the payload of a TextMessage.
 The JmsListener annotation defines the name of the Destination that this method should listen to and the reference to the JmsListenerContainerFactory to use to create the underlying message listener container. Strictly speaking that last attribute is not necessary unless you need to customize the way the container is built as Spring Boot registers a default factory if necessary.
 */
@Component
public class Receiver {
    @Autowired
    ConfigurableApplicationContext context;

    @JmsListener(destination = "mailbox-destination", containerFactory = "myJmsContainerFactory")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        context.close();
        FileSystemUtils.deleteRecursively(new File("activemq-data"));
    }

}
