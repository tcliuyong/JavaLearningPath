package tcliuyong;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Created by liuyong on 2016/3/11.
 */
@Service
public class GitHubLookupService {
    RestTemplate restTemplate = new RestTemplate();
//异步的方法 会建立一个线程自己运行
    @Async
    public Future<User> findUser(String user) throws InterruptedException {
        System.out.println("Looking up " + user);
        User results = restTemplate.getForObject("https://api.github.com/users/" + user, User.class);
        // Artificial delay of 1s for demonstration purposes
        Thread.sleep(1000L);
        return new AsyncResult<User>(results);
    }
}
