package com.socgen.arjun.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sectors {
	
	@Id
    int sid;
	
    String SectorName,Brief;
    
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getSectorName() {
		return SectorName;
	}
	public void setSectorName(String sectorName) {
		SectorName = sectorName;
	}
	
	public String getBrief() {
		return Brief;
	}
	public void setBrief(String brief) {
		Brief = brief;
	}
    
    

}
