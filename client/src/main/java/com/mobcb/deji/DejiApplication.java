package com.mobcb.deji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.mobcb.deji.client"})
@ComponentScans({@ComponentScan({"com.mobcb.deji"})})
public class DejiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DejiApplication.class, args);
	}
}
