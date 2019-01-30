package com.sep.naucnacentrala.elasticsearch;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

public class KorisnikESDTO {
	
	@Field(type = FieldType.Text)
	private String ime;

	@Field(type = FieldType.Text)
	private String prezime;

	@Field(type = FieldType.Keyword)
	private String email;
	
	public KorisnikESDTO() {
		// TODO Auto-generated constructor stub
	}

	public KorisnikESDTO(String ime, String prezime, String email) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
