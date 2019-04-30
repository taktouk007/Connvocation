package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Section implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5617274583625376459L;
	/**
	 * 
	 */
	@Id @GeneratedValue
	private Long code;
	private String libelle;
	@ManyToMany
	private List<Matiere> matieres;
	
}
