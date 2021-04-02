package com.example.ukk_lintang.Model.Spp;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseSpp{

	@SerializedName("result")
	private List<SppResultItem> result;

	@SerializedName("code")
	private int code;

	@SerializedName("message")
	private String message;

	public void setResult(List<SppResultItem> result){
		this.result = result;
	}

	public List<SppResultItem> getResult(){
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