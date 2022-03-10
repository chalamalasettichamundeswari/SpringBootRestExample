package com.springboot.springweb.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.info.Info.Builder;

import org.springframework.boot.actuate.info.InfoContributor;

import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements InfoContributor {

	@Override
	public void contribute(Builder builder) {

		builder.withDetail("test", 123);

		}

}
//@Component
//public class CustomHealthIndicator implements HealthIndicator {
//
//	@Override
//	public Health health() {
//		boolean error= true;
//		if(error) {
//			return Health.down().withDetail("ErrorKey",123).build();
//		}
//		// TODO Auto-generated method stub
//		return Health.up().build();
//	}
//
//}
