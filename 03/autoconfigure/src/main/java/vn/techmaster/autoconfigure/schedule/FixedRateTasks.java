package vn.techmaster.autoconfigure.schedule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@ConditionalOnExpression("false")
public class FixedRateTasks {
  @Scheduled(fixedRate = 1000)
  public void scheduleFixedRate() throws InterruptedException {
    System.out.println("Fixed rate task - " + System.currentTimeMillis() / 1000);
    Thread.sleep(2000);
  }
}
