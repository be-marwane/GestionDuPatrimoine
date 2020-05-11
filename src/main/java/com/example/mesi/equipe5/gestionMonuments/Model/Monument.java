package com.example.mesi.equipe5.gestionMonuments.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Monument {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String appellationCourante;
	private Integer siecle;
	private String precisionSurLaProtection;
	private String dateDeProtection;
	private String  statut;
	private String description;
	private String historique;
	private String auteur;
	private String adresse;
	private String siecleFormatBrut;
	private String region;
	private String departement;
	private String commune;
	private String affectataire;
	private String niveauDeProtection;
	private String adresse1;
	private String Commune1;
	private Integer codeDepartement;
	private String ancienneRegion;
	private String DMAJ;
	private String reference;
	private String base;
	private Integer INSEE;
	private String coordonneesBan;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppellationCourante() {
		return appellationCourante;
	}
	public void setAppellationCourante(String appellationCourante) {
		this.appellationCourante = appellationCourante;
	}
	public Integer getSiecle() {
		return siecle;
	}
	public void setSiecle(Integer siecle) {
		this.siecle = siecle;
	}
	public String getPrecisionSurLaProtection() {
		return precisionSurLaProtection;
	}
	public void setPrecisionSurLaProtection(String précisionSurLaProtection) {
		this.precisionSurLaProtection = précisionSurLaProtection;
	}
	public String getDateDeProtection() {
		return dateDeProtection;
	}
	public void setDateDeProtection(String dateDeProtection) {
		this.dateDeProtection = dateDeProtection;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHistorique() {
		return historique;
	}
	public void setHistorique(String historique) {
		this.historique = historique;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSiecleFormatBrut() {
		return siecleFormatBrut;
	}
	public void setSiecleFormatBrut(String siecleFormatBrut) {
		this.siecleFormatBrut = siecleFormatBrut;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getAffectataire() {
		return affectataire;
	}
	public void setAffectataire(String affectataire) {
		this.affectataire = affectataire;
	}
	public String getNiveauDeProtection() {
		return niveauDeProtection;
	}
	public void setNiveauDeProtection(String niveauDeProtection) {
		this.niveauDeProtection = niveauDeProtection;
	}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getCommune1() {
		return Commune1;
	}
	public void setCommune1(String commune1) {
		Commune1 = commune1;
	}
	public Integer getCodeDepartement() {
		return codeDepartement;
	}
	public void setCodeDepartement(Integer codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	public String getAncienneRegion() {
		return ancienneRegion;
	}
	public void setAncienneRegion(String ancienneRegion) {
		this.ancienneRegion = ancienneRegion;
	}
	public String getDMAJ() {
		return DMAJ;
	}
	public void setDMAJ(String dMAJ) {
		DMAJ = dMAJ;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Integer getINSEE() {
		return INSEE;
	}
	public void setINSEE(Integer iNSEE) {
		INSEE = iNSEE;
	}
	public String getCoordonneesBan() {
		return coordonneesBan;
	}
	public void setCoordonneesBan(String coordonneesBan) {
		this.coordonneesBan = coordonneesBan;
	}

	

}
