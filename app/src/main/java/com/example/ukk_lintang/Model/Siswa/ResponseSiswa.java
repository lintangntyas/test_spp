package com.example.ukk_lintang.Model.Siswa;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseSiswa{

	@SerializedName("result")
	private List<SiswaResultItem> result;

	@SerializedName("code")
	private int code;

	@SerializedName("message")
	private String message;

	public void setResult(List<SiswaResultItem> result){
		this.result = result;
	}

	public List<SiswaResultItem> getResult(){
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