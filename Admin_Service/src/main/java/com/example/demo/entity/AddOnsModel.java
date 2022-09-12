package com.example.demo.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOnsModel {
    @Id
    private String id;
    private String addon;
    private double cost;
    private boolean active;
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCost(int cost2) {
		// TODO Auto-generated method stub
		
	}
	public Object getAddon() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAddon(Object addon2) {
		// TODO Auto-generated method stub
		
	}
	public Object isActive() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setActive(Object active2) {
		// TODO Auto-generated method stub
		
	}
}

