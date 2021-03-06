package cn.com.liliyun.market.model;

import java.io.Serializable;
import java.util.List;

import cn.com.liliyun.common.model.BaseModel;

public class CSEnrolIndex extends BaseModel implements Serializable{

	private int id;
	
	private int year;
	
	private int month;
	
	private Integer enrolindex;
	
	private List<CSEnrolIndex> data;
	
	

	public List<CSEnrolIndex> getData() {
		return data;
	}

	public void setData(List<CSEnrolIndex> data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public Integer getEnrolindex() {
		return enrolindex;
	}

	public void setEnrolindex(Integer enrolindex) {
		this.enrolindex = enrolindex;
	}
	
	
}
