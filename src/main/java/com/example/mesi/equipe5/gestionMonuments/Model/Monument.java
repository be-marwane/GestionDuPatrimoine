package com.example.mesi.equipe5.gestionMonuments.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Monument {

	@Id
	private Long unique_number;
	
	private String name_en;
	private String name_fr;
	private String short_description_en;
	private String short_description_fr;
	private String justification_en;
	private String justification_fr;
	private Integer date_inscribed;
	private Double longitude;
	private Double latitude;
	private Double area_hectares;
	private String category_short;
	private String states_name_en;
	private String states_name_fr;
	private String region_en;
	private String region_fr;
	private String urlAudio;
	private String mobiliteReduite;
	private String type;
	private String urlWiki;
	private String UrlPhoto;
	private String UrlIcone;
	private String ville;
	private Integer codePostal;
	public Long getUnique_number() {
		return unique_number;
	}
	public void setUnique_number(Long unique_number) {
		this.unique_number = unique_number;
	}
	public String getName_en() {
		return name_en;
	}
	public void setName_en(String name_en) {
		this.name_en = name_en;
	}
	public String getName_fr() {
		return name_fr;
	}
	public void setName_fr(String name_fr) {
		this.name_fr = name_fr;
	}
	public String getShort_description_en() {
		return short_description_en;
	}
	public void setShort_description_en(String short_description_en) {
		this.short_description_en = short_description_en;
	}
	public String getShort_description_fr() {
		return short_description_fr;
	}
	public void setShort_description_fr(String short_description_fr) {
		this.short_description_fr = short_description_fr;
	}
	public String getJustification_en() {
		return justification_en;
	}
	public void setJustification_en(String justification_en) {
		this.justification_en = justification_en;
	}
	public String getJustification_fr() {
		return justification_fr;
	}
	public void setJustification_fr(String justification_fr) {
		this.justification_fr = justification_fr;
	}
	public Integer getDate_inscribed() {
		return date_inscribed;
	}
	public void setDate_inscribed(Integer date_inscribed) {
		this.date_inscribed = date_inscribed;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getArea_hectares() {
		return area_hectares;
	}
	public void setArea_hectares(Double area_hectares) {
		this.area_hectares = area_hectares;
	}
	public String getCategory_short() {
		return category_short;
	}
	public void setCategory_short(String category_short) {
		this.category_short = category_short;
	}
	public String getStates_name_en() {
		return states_name_en;
	}
	public void setStates_name_en(String states_name_en) {
		this.states_name_en = states_name_en;
	}
	public String getStates_name_fr() {
		return states_name_fr;
	}
	public void setStates_name_fr(String states_name_fr) {
		this.states_name_fr = states_name_fr;
	}
	public String getRegion_en() {
		return region_en;
	}
	public void setRegion_en(String region_en) {
		this.region_en = region_en;
	}
	public String getRegion_fr() {
		return region_fr;
	}
	public void setRegion_fr(String region_fr) {
		this.region_fr = region_fr;
	}
	public String getUrlAudio() {
		return urlAudio;
	}
	public void setUrlAudio(String urlAudio) {
		this.urlAudio = urlAudio;
	}
	public String getMobiliteReduite() {
		return mobiliteReduite;
	}
	public void setMobiliteReduite(String mobiliteReduite) {
		this.mobiliteReduite = mobiliteReduite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrlWiki() {
		return urlWiki;
	}
	public void setUrlWiki(String urlWiki) {
		this.urlWiki = urlWiki;
	}
	public String getUrlPhoto() {
		return UrlPhoto;
	}
	public void setUrlPhoto(String urlPhoto) {
		UrlPhoto = urlPhoto;
	}
	public String getUrlIcone() {
		return UrlIcone;
	}
	public void setUrlIcone(String urlIcone) {
		UrlIcone = urlIcone;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Integer getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	
	
	

	

}
