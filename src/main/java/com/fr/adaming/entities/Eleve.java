package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Eleve implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5122445353933149733L;
	/**
	 * 
	 */
	@Id @GeneratedValue
	private Long idEleve;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Section section;
	
	@ManyToMany
	private List<Epreuve> epreuves;
}
