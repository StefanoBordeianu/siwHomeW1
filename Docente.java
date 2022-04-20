package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Docente {

	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private int partitaIva;
	private LocalDate dataDiNascita;

	//i cambiamenti ai docenti si devono riflettere nei corsi
	@OneToMany (mappedBy = "docente", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Corso> corsi;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public int getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(int partitaIva) {
		this.partitaIva = partitaIva;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

}
