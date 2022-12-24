package com.springframework.ioc;

public class BasketBall implements Coach{
	
	private HappyForFortune happyForFortune;
	
	
	
	public BasketBall(HappyForFortune happyForFortune) {
		super();
		this.happyForFortune = happyForFortune;
	}

	@Override
	public void practice() {
		System.out.println("Do 3 Hours exercise daily");
		
	}

	@Override
	public String getDailyFortune() {
		return "Be yourself "+happyForFortune.getFortune();
	}

}
