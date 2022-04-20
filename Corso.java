package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Corso {

	private String nome;
	private LocalDate dataInizio;
	private int durata;

	//un corso deve sempre avere a disposizione la lista degli allievi
	@ManyToMany (fetch = FetchType.EAGER)
	private List<Allievo> allievi;
	
	@ManyToOne 
	private Docente docente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public Docente getDocenti() {
		return docente;
	}

	public void setDocenti(Docente docenti) {
		this.docente = docenti;
	}

}
