package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Allievo {

	private String nome;
	private String cognome;
	private String email;
	private String luogoDiNascita;
	private int matricola;
	private LocalDate dataDiNascita;

	@ManyToOne
	private Societa azienda;

	//posso pensare che modificato un allivo questo debba essere modificato nei corsi
	@ManyToMany (mappedBy = "allievi" ,cascade = {CascadeType.PERSIST,CascadeType.MERGE} )
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Societa getAzienda() {
		return azienda;
	}

	public void setAzienda(Societa azienda) {
		this.azienda = azienda;
	}

	public List<Corso> getCorso() {
		return corsi;
	}

	public void setCorso(List<Corso> corso) {
		this.corsi = corso;
	}

}
