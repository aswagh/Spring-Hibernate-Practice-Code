package com.springframework.ioc;

public class Tennis implements Coach {

	private HappyForFortune happyForFortune;
	private String emailAddress;
	private String team;
	
	@Override
	public void practice() {
		System.out.println("Tennis player must do flex exercies");
	}
	@Override
	public String getDailyFortune() {
		return "Best of luck -"+happyForFortune.getFortune();
	}
	public HappyForFortune getHappyForFortune() {
		return happyForFortune;
	}
	public void setHappyForFortune(HappyForFortune happyForFortune) {
		this.happyForFortune = happyForFortune;
	}
	public String getEmailAdress() {return emailAddress;	}
	public void setEmailAdress(String emailAddress) {this.emailAddress = emailAddress;}

	public String getTeam() {return team;}
	
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Tennis [happyForFortune=" + happyForFortune + ", emailAddress=" + emailAddress + ", team=" + team + "]";
	}

	
}
