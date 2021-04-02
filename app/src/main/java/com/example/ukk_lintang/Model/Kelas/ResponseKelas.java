package com.example.ukk_lintang.Model.Kelas;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseKelas{

	@SerializedName("result")
	private List<KelasResultItem> result;

	@SerializedName("code")
	private int code;

	@SerializedName("message")
	private String message;

	public void setResult(List<KelasResultItem> result){
		this.result = result;
	}

	public List<KelasResultItem> getResult(){
		return result;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}