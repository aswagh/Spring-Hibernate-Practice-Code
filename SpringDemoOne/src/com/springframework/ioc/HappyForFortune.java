package com.springframework.ioc;

public class HappyForFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your luck day";
	}

}
