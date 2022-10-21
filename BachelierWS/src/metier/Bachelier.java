package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Bachelier")
public class Bachelier implements Serializable {

	private static final long serialVersionUID = 1L;
private int id;
private String cin;
private String numetud;
private double notemath;
private double notephys;
private double notearabe;
private double noteanglais;
private String nomprenom ;
public Bachelier() {
	super();
	// TODO Auto-generated constructor stub
}

public Bachelier(int id, String cin, String numetud, double notemath, double notephys, double notearabe,
		double noteanglais, String nomprenom) {
	super();
	this.id = id;
	this.cin = cin;
	this.numetud = numetud;
	this.notemath = notemath;
	this.notephys = notephys;
	this.notearabe = notearabe;
	this.noteanglais = noteanglais;
	this.nomprenom = nomprenom;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}
public String getNumetud() {
	return numetud;
}
public void setNumetud(String numetud) {
	this.numetud = numetud;
}
public double getNotemath() {
	return notemath;
}
public void setNotemath(double notemath) {
	this.notemath = notemath;
}
public double getNotephys() {
	return notephys;
}
public void setNotephys(double notephys) {
	this.notephys = notephys;
}
public double getNotearabe() {
	return notearabe;
}
public void setNotearabe(double notearabe) {
	this.notearabe = notearabe;
}
public double getNoteanglais() {
	return noteanglais;
}
public void setNoteanglais(double noteanglais) {
	this.noteanglais = noteanglais;
}
public String getNomprenom() {
	return nomprenom;
}
public void setNomprenom(String nomprenom) {
	this.nomprenom = nomprenom;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}