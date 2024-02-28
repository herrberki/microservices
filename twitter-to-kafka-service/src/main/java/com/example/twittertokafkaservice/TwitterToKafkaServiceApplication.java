package com.example.twittertokafkaservice;

import com.example.twittertokafkaservice.config.TwitterToKafkaServiceConfigData;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData twitter) {
        this.twitter = twitter;
    }

    public static void main(String[] args) {
		SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
	}

	private final TwitterToKafkaServiceConfigData twitter;
	private static final Logger Log = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);


	@Override
	public void run(String... args) throws Exception {
		Log.info("App starts....");
		Log.info(Arrays.toString(twitter.getTwitterKeywords().toArray(new String[] {})));
	}
}
