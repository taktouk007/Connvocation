package com.fr.adaming;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.entities.Eleve;
import com.fr.adaming.entities.Epreuve;
import com.fr.adaming.entities.Laboratoire;
import com.fr.adaming.entities.Matiere;
import com.fr.adaming.entities.Section;
import com.fr.adaming.restrepository.IEleveRepo;
import com.fr.adaming.restrepository.IEpreuveRepo;
import com.fr.adaming.restrepository.ILaboratoireRepo;
import com.fr.adaming.restrepository.IMatiereRepo;
import com.fr.adaming.restrepository.ISectionRepo;

@SpringBootApplication
public class ConvoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConvoApplication.class, args);
		IEleveRepo eleveRepo = ctx.getBean(com.fr.adaming.restrepository.IEleveRepo.class);
		IEpreuveRepo epreuveRepo = ctx.getBean(com.fr.adaming.restrepository.IEpreuveRepo.class);
		ILaboratoireRepo laboRepo = ctx.getBean(com.fr.adaming.restrepository.ILaboratoireRepo.class);
		IMatiereRepo matiereRepo = ctx.getBean(com.fr.adaming.restrepository.IMatiereRepo.class);
		ISectionRepo sectionRepo = ctx.getBean(com.fr.adaming.restrepository.ISectionRepo.class);
		
		
		
		
		Matiere math = new Matiere(null, "Math", 42, 4);
		Laboratoire labo = new Laboratoire(null, "Lab 1", 15);
		
		
		math = matiereRepo.save(math);
		Section mathS = new Section(null, "Mathématique", new ArrayList<>());
		mathS.getMatieres().add(math);
		mathS = sectionRepo.save(mathS);
		labo = laboRepo.save(labo);
		Epreuve ep = new Epreuve(null, new Date(), 8, labo, math);
		ep = epreuveRepo.save(ep);
		Eleve benali = new Eleve(null, "BENALI", "Ibrahim", new Date(), mathS, new ArrayList<>());
		benali.getEpreuves().add(ep);
		benali = eleveRepo.save(benali);
	}
	
}
