package com.example.ukk_lintang.Model.Petugas;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponsePetugas{

	@SerializedName("result")
	private List<PetugasResultItem> result;

	@SerializedName("code")
	private int code;

	@SerializedName("message")
	private String message;

	public void setResult(List<PetugasResultItem> result){
		this.result = result;
	}

	public List<PetugasResultItem> getResult(){
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