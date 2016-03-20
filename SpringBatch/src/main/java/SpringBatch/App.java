package SpringBatch;

import jdk.nashorn.internal.scripts.JO;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void executeJob(String jobPath, String jobName, JobParametersBuilder builder){
        ApplicationContext context = new ClassPathXmlApplicationContext(jobPath);
        JobLauncher launcher = (JobLauncher)context.getBean("jobLauncher");
        Job job = (Job) context.getBean(jobName);
        try {
            JobExecution result = launcher.run(job, builder.toJobParameters());
            System.out.println(result.toString());
        }catch (Exception e){

        }
    }
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("base/job.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("billJob");//获取任务对象
        try{
            JobExecution result = launcher.run(job, new JobParameters());
        }catch (Exception e){
            e.printStackTrace();
        }
        executeJob("base/job.xml","billJob",new JobParametersBuilder().addString("date","21212"));
    }
}
