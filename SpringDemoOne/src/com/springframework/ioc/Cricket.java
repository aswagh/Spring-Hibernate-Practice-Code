package com.springframework.ioc;

public class Cricket implements Coach {

	private HappyForFortune happyForFortune;
	private String email;
	private String team;
	
	public Cricket(HappyForFortune happyForFortune) {
		super();
		this.happyForFortune = happyForFortune;
	}

	@Override
	public void practice() {
		System.out.println("do 2 hours of exercies daily ");

	}

	@Override
	public String getDailyFortune() {
		return "Just Be Ready"+happyForFortune.getFortune();
	}

	public HappyForFortune getHappyForFortune() {
		return happyForFortune;
	}

	public void setHappyForFortune(HappyForFortune happyForFortune) {
		this.happyForFortune = happyForFortune;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Cricket [happyForFortune=" + happyForFortune + ", email=" + email + ", team=" + team + "]";
	}

}
