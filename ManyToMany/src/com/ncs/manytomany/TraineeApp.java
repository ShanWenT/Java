package com.ncs.manytomany;

import java.util.HashSet;

public class TraineeApp {

	public static void main(String[] args) {
		Skills s1 = new Skills();
		Skills s2 = new Skills();
		Skills s3 = new Skills();
		s1.setSname("Java");
		s2.setSname("HTML");
		s3.setSname("AngularJS");
		
		HashSet hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		Trainee t1 = new Trainee();
		Trainee t2 = new Trainee();
		
		t1.setTname("Wei Xuan");
		t2.setTname("YS");
		
		t1.setTechStack(hs);
		t2.setTechStack(hs);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(t1);
		hm.insert(t2);
	}

}
