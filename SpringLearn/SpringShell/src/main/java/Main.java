import com.apress.springrecipes.interest.InterestCalculator;
import com.sun.glass.ui.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuyong on 16-1-10.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        InterestCalculator interestCalculator  = (InterestCalculator) applicationContext.getBean("interestCalculator");
        while(true){
            Thread.sleep(3000);
            System.out.println(interestCalculator.calculate(100,200));
        }

    }
}
