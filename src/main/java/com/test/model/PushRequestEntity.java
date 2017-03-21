package com.test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@NamedQueries({
		@NamedQuery(name = PushRequestEntity.GET_ALL_RECORD, query = "from PushRequestEntity order by createdDate ASC") })
public class PushRequestEntity {

	public static final String GET_ALL_RECORD = "GET_ALL_RECORD";
	@Id
	@GeneratedValue
	private Integer id;

	private Integer i1;

	private Integer i2;

	@JsonIgnore
	private Date createdDate = new Date();

	public Integer getI2() {
		return i2;
	}

	public void setI2(Integer i2) {
		this.i2 = i2;
	}

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
