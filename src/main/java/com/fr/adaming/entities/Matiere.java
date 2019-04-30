package com.fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Matiere implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4168332649077060181L;
	/**
	 * 
	 */
	@Id @GeneratedValue
	private Long code;
	private String libelle;
	private float duree;
	private int coeff;
}
