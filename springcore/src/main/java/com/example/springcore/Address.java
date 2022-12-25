package com.example.springcore;

public class Address {

		private String city;
		private String state;	

		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Address(String city, String state) {
			super();
			this.city = city;
			this.state = state;
		}

		@Override
		public String toString() {
			return "Address [city=" + city + ", state=" + state + "]";
		}

}
