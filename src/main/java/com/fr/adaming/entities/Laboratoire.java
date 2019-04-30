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
public class Laboratoire implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7745377288190695693L;
	/**
	 * 
	 */
	@Id @GeneratedValue
	private Long numero;
	private String nom;
	private int nbrOrdinateur;
}
