package controller;

import java.io.Serializable;

public class ResponseResult<E> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer state;
	private String massage;
	private  E data;
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}

}
