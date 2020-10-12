package entity;

import java.sql.Date;
import java.time.LocalDate;

public class Exercise {
	private int pull_up;
	private int hspu;
	private int push_up;
	private int samdu;
	private int dips;
	private int dumbbell_curl;
	private int chin_up;
	private Date regdate;
	
	public Exercise() {}
	
	public Exercise(int pull_up, int hspu, int push_up, int samdu, int dips, int dumbbell_curl, int chin_up) {
		this.pull_up = pull_up;
		this.hspu = hspu;
		this.push_up = push_up;
		this.samdu = samdu;
		this.dips = dips;
		this.dumbbell_curl = dumbbell_curl;
		this.chin_up = chin_up;
//		this.regdate = regdate;
	}
	
	public int getPull_up() {
		return pull_up;
	}
	public void setPull_up(int pull_up) {
		this.pull_up = pull_up;
	}
	public int getHspu() {
		return hspu;
	}
	public void setHspu(int hspu) {
		this.hspu = hspu;
	}
	public int getPush_up() {
		return push_up;
	}
	public void setPush_up(int push_up) {
		this.push_up = push_up;
	}
	public int getSamdu() {
		return samdu;
	}
	public void setSamdu(int samdu) {
		this.samdu = samdu;
	}
	public int getDips() {
		return dips;
	}
	public void setDips(int dips) {
		this.dips = dips;
	}
	public int getDumbbell_curl() {
		return dumbbell_curl;
	}
	public void setDumbbell_curl(int dumbbell_curl) {
		this.dumbbell_curl = dumbbell_curl;
	}
	public int getChin_up() {
		return chin_up;
	}
	public void setChin_up(int chin_up) {
		this.chin_up = chin_up;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
