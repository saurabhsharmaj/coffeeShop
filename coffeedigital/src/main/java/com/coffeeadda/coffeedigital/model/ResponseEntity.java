package com.coffeeadda.coffeedigital.model;

import java.util.List;

public class ResponseEntity<T> {

	String msg;
	Object data;
	List<T> dataList;
	
	
	
	public ResponseEntity(String msg, List<T> dataList) {
		super();
		this.msg = msg;
		this.dataList = dataList;
	}
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public ResponseEntity(String msg, Object data) {
		super();
		this.msg = msg;
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseEntity [msg=" + msg + ", data=" + data + "]";
	}
	
	
	public ResponseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
