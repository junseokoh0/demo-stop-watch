package com.example.demostopwatch;

import com.example.demostopwatch.demo.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class DemoStopWatchApplication implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(DemoStopWatchApplication.class);

    private final DemoService demoService;

    public DemoStopWatchApplication(DemoService demoService) {
        this.demoService = demoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoStopWatchApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        StopWatch stopWatch1 = new StopWatch("executeA_1");
        stopWatch1.start();
        demoService.executeA_1();
        stopWatch1.stop();
        logger.info("ArrayList 순차 추가 : {}", stopWatch1.getTotalTimeSeconds());


        StopWatch stopWatch2 = new StopWatch("executeB_1");
        stopWatch2.start();
        demoService.executeB_1();
        stopWatch2.stop();
        logger.info("LinkedList 순차 추가 : {}", stopWatch2.getTotalTimeSeconds());

        StopWatch stopWatch3 = new StopWatch("executeA_2");
        stopWatch3.start();
        demoService.executeA_2();
        stopWatch3.stop();
        logger.info("ArrayList 중간 추가 : {}", stopWatch3.getTotalTimeSeconds());


        StopWatch stopWatch4 = new StopWatch("executeB_2");
        stopWatch4.start();
        demoService.executeB_2();
        stopWatch4.stop();
        logger.info("LinkedList 중간 추가 : {}", stopWatch4.getTotalTimeSeconds());
    }

}
