package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Epreuve implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2716995992188197705L;
	/**
	 * 
	 */
	@Id @GeneratedValue
	private Long idEpreuve;
	private Date date;
	private int heure;
	@ManyToOne
	private Laboratoire labo;
	@ManyToOne
	private Matiere matiere;
}
