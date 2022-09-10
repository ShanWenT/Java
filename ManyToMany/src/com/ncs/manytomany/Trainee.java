package com.ncs.manytomany;

import java.util.Set;

public class Trainee {

	int tid;
	String tname;
	Set techStack;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set getTechStack() {
		return techStack;
	}
	public void setTechStack(Set techStack) {
		this.techStack = techStack;
	}
}
