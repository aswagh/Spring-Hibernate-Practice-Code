package com.example.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {

		private int id;
		private String name;
		private Address address;
		private List<String> subjects;
		private Map<String, Integer> score;
		private Properties props;

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(Address address) {
			super();
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getSubjects() {
			return subjects;
		}

		public void setSubjects(List<String> subjects) {
			this.subjects = subjects;
		}

		public Map<String, Integer> getScore() {
			return score;
		}

		public void setScore(Map<String, Integer> score) {
			this.score = score;
		}

		public Properties getProps() {
			return props;
		}

		public void setProps(Properties props) {
			this.props = props;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", address=" + address + ", subjects=" + subjects
					+ ", score=" + score + ", props=" + props + "]";
		}
		
		
}
