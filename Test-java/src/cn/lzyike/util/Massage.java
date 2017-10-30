package cn.lzyike.util;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author dingle
 *这是一个消息模型
 * @param <T> 储存的集合类型
 */
public class Massage<T> {
	private Integer code;
	private String msg;
	private List<T> data;
	private String dataType;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public void addData(T t) {
		if(this.data == null) {
			this.data = new ArrayList<T>();
		}
		this.data.add(t);
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}
