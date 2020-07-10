package com.example.mesi.equipe5.gestionMonuments.Model;

import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "monuments")
@Access(value= AccessType.FIELD)
public class Monument {

	@Id
	@Column(name = "unique_number")
	private BigDecimal unique_number;
	
	@Column(name = "name_fr")
	private String name_fr;
	
	@Column(name = "short_description_en")
	private String short_description_en;
	
	@Column(name = "short_description_fr")
	private String short_description_fr;
	
	@Column(name = "date_inscribed")
	private Integer date_inscribed;
	
	@Column(name = "longitude")
	private BigDecimal longitude;
	
	@Column(name = "latitude")
	private BigDecimal latitude;
	
	@Column(name = "area_hectares")
	private String area_hectares;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "category_short")
	private String category_short;
	
	@Column(name = "states_name_en")
	private String states_name_en;
	
	@Column(name = "states_name_fr")
	private String states_name_fr;

	@Column(name = "region_en")
	private String region_en;
	
	@Column(name = "region_fr")
	private String region_fr;
	
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "ville")
	private String ville;
	
	@Column(name = "url_icone")
	private String url_icone;
	
	@Column(name = "url_audio")
	private String url_audio;
	
	@Column(name = "mobilite_reduite")
	private String mobilite_reduite;
	
	
	@Column(name = "url_wiki")
	private String url_wiki;
	
	@Column(name = "url_photo")
	private String url_photo;
	
	@Column(name = "code_postal")
	private String code_postal;
	
	
	public Monument() {}
	

	public Monument(BigDecimal unique_number, String name_fr, String short_description_en, String short_description_fr,
			Integer date_inscribed, BigDecimal longitude, BigDecimal latitude, String area_hectares, String category,
			String category_short, String states_name_en, String states_name_fr, String region_en, String region_fr,
			String type, String ville, String url_icone, String url_audio, String mobilite_reduite, String url_wiki,
			String url_photo, String code_postal) {
		this.unique_number = unique_number;
		this.name_fr = name_fr;
		this.short_description_en = short_description_en;
		this.short_description_fr = short_description_fr;
		this.date_inscribed = date_inscribed;
		this.longitude = longitude;
		this.latitude = latitude;
		this.area_hectares = area_hectares;
		this.category = category;
		this.category_short = category_short;
		this.states_name_en = states_name_en;
		this.states_name_fr = states_name_fr;
		this.region_en = region_en;
		this.region_fr = region_fr;
		this.type = type;
		this.ville = ville;
		this.url_icone = url_icone;
		this.url_audio = url_audio;
		this.mobilite_reduite = mobilite_reduite;
		this.url_wiki = url_wiki;
		this.url_photo = url_photo;
		this.code_postal = code_postal;
	}

	public BigDecimal getUnique_number() {
		return unique_number;
	}

	public void setUnique_number(BigDecimal unique_number) {
		this.unique_number = unique_number;
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

	public Integer getDate_inscribed() {
		return date_inscribed;
	}

	public void setDate_inscribed(Integer date_inscribed) {
		this.date_inscribed = date_inscribed;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getArea_hectares() {
		return area_hectares;
	}

	public void setArea_hectares(String area_hectares) {
		this.area_hectares = area_hectares;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getUrl_icone() {
		return url_icone;
	}

	public void setUrl_icone(String url_icone) {
		this.url_icone = url_icone;
	}

	public String getUrl_audio() {
		return url_audio;
	}

	public void setUrl_audio(String url_audio) {
		this.url_audio = url_audio;
	}

	public String getMobilite_reduite() {
		return mobilite_reduite;
	}

	public void setMobilite_reduite(String mobilite_reduite) {
		this.mobilite_reduite = mobilite_reduite;
	}

	public String getUrl_wiki() {
		return url_wiki;
	}

	public void setUrl_wiki(String url_wiki) {
		this.url_wiki = url_wiki;
	}

	public String getUrl_photo() {
		return url_photo;
	}

	public void setUrl_photo(String url_photo) {
		this.url_photo = url_photo;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	
	
}
