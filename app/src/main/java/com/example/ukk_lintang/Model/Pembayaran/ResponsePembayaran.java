package com.example.ukk_lintang.Model.Pembayaran;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponsePembayaran{

	@SerializedName("result")
	private List<PembayaranResultItem> result;

	@SerializedName("code")
	private int code;

	@SerializedName("message")
	private String message;

	public void setResult(List<PembayaranResultItem> result){
		this.result = result;
	}

	public List<PembayaranResultItem> getResult(){
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