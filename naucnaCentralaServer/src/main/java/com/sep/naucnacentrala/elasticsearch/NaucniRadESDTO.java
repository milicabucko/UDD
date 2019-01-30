package com.sep.naucnacentrala.elasticsearch;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(indexName = "scientificpaper", type="paper", shards = 1 )
public class NaucniRadESDTO {

	@Id
	private Long id;
	
	@Field(type = FieldType.Keyword)
	@JsonProperty
	private String nazivMagazina;
	
	@Field(type = FieldType.Text)
	@JsonProperty
	private String naslovRada;
	
	@Field(type = FieldType.Keyword)
	@JsonProperty
	private String autor;
	
	@Field(type = FieldType.Text)
	@JsonProperty
	private String kljucniPojmovi;
	
	@Field(type = FieldType.Text)
	@JsonProperty
	private String pdfText;
	
	@Field(type = FieldType.Text)
	@JsonProperty
	private String naucnaOblast;
	
	@Field(type = FieldType.Nested)
	@JsonProperty
	private List<KorisnikESDTO> koautori;
	
	@Field(type = FieldType.Nested)
	@JsonProperty
	private List<KorisnikESDTO> recenzente;
	
	@GeoPointField
	@JsonProperty
	private GeoPoint geo_point;
	
	public NaucniRadESDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public NaucniRadESDTO(Long id, String nazivMagazina, String naslovRada, String autor, String kljucniPojmovi,
			String pdfText, String naucnaOblast, List<KorisnikESDTO> koautori, List<KorisnikESDTO> recenzente, GeoPoint geo_point) {
		super();
		this.id = id;
		this.nazivMagazina = nazivMagazina;
		this.naslovRada = naslovRada;
		this.autor = autor;
		this.kljucniPojmovi = kljucniPojmovi;
		this.pdfText = pdfText;
		this.naucnaOblast = naucnaOblast;
		this.koautori = koautori;
		this.recenzente = recenzente;
		this.geo_point = geo_point;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazivMagazina() {
		return nazivMagazina;
	}

	public void setNazivMagazina(String nazivMagazina) {
		this.nazivMagazina = nazivMagazina;
	}

	public String getNaslovRada() {
		return naslovRada;
	}

	public void setNaslovRada(String naslovRada) {
		this.naslovRada = naslovRada;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getKljucniPojmovi() {
		return kljucniPojmovi;
	}

	public void setKljucniPojmovi(String kljucniPojmovi) {
		this.kljucniPojmovi = kljucniPojmovi;
	}

	public String getPdfText() {
		return pdfText;
	}

	public void setPdfText(String pdfText) {
		this.pdfText = pdfText;
	}

	public String getNaucnaOblast() {
		return naucnaOblast;
	}

	public void setNaucnaOblast(String naucnaOblast) {
		this.naucnaOblast = naucnaOblast;
	}

	public List<KorisnikESDTO> getKoautori() {
		return koautori;
	}

	public void setKoautori(List<KorisnikESDTO> koautori) {
		this.koautori = koautori;
	}

	public List<KorisnikESDTO> getRecenzente() {
		return recenzente;
	}

	public void setRecenzente(List<KorisnikESDTO> recenzente) {
		this.recenzente = recenzente;
	}

	public GeoPoint getGeo_point() {
		return geo_point;
	}

	public void setGeo_point(GeoPoint geo_point) {
		this.geo_point = geo_point;
	}
	
	
	
}
