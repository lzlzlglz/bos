package com.vvxc.bos.bean;

// Generated 2017-5-12 22:45:22 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * BcStaff generated by hbm2java
 */
public class Staff implements java.io.Serializable {

	private String id;
	private String name;
	private String telephone;
	private Character haspda;
	private Character deltag;
	private String station;
	private String standard;
	private Set bcDecidedzones = new HashSet(0);

	public Staff() {
	}

	public Staff(String id) {
		this.id = id;
	}

	public Staff(String id, String name, String telephone, Character haspda,
			Character deltag, String station, String standard,
			Set bcDecidedzones) {
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.haspda = haspda;
		this.deltag = deltag;
		this.station = station;
		this.standard = standard;
		this.bcDecidedzones = bcDecidedzones;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Character getHaspda() {
		return this.haspda;
	}

	public void setHaspda(Character haspda) {
		this.haspda = haspda;
	}

	public Character getDeltag() {
		return this.deltag;
	}

	public void setDeltag(Character deltag) {
		this.deltag = deltag;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Set getBcDecidedzones() {
		return this.bcDecidedzones;
	}

	public void setBcDecidedzones(Set bcDecidedzones) {
		this.bcDecidedzones = bcDecidedzones;
	}

}