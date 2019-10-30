package Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable

public class PlaningPK implements Serializable {
private int idFormation;
	
private int idEmploye;
@Temporal(TemporalType.DATE)
private Date dateDebut;

@Temporal(TemporalType.DATE)
private Date dateFin;
private int nbrMaximal ;

public int getIdFormation() {
	return idFormation;
}
public void setIdFormation(int idFormation) {
	this.idFormation = idFormation;
}
public int getIdEmploye() {
	return idEmploye;
}
public void setIdEmploye(int idEmploye) {
	this.idEmploye = idEmploye;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public int getNbrMaximal() {
	return nbrMaximal;
}
public void setNbrMaximal(int nbrMaximal) {
	this.nbrMaximal = nbrMaximal;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
	result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
	result = prime * result + idEmploye;
	result = prime * result + idFormation;
	result = prime * result + nbrMaximal;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PlaningPK other = (PlaningPK) obj;
	if (dateDebut == null) {
		if (other.dateDebut != null)
			return false;
	} else if (!dateDebut.equals(other.dateDebut))
		return false;
	if (dateFin == null) {
		if (other.dateFin != null)
			return false;
	} else if (!dateFin.equals(other.dateFin))
		return false;
	if (idEmploye != other.idEmploye)
		return false;
	if (idFormation != other.idFormation)
		return false;
	if (nbrMaximal != other.nbrMaximal)
		return false;
	return true;
}
@Override
public String toString() {
	return "PlaningPK [idFormation=" + idFormation + ", idEmploye=" + idEmploye + ", dateDebut=" + dateDebut + ", dateFin="
			+ dateFin + ", nbrMaximal=" + nbrMaximal + "]";
}
public PlaningPK(int idMission, int idEmploye, Date dateDebut, Date dateFin, int nbrMaximal) {
	super();
	this.idFormation = idFormation;
	this.idEmploye = idEmploye;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.nbrMaximal = nbrMaximal;
}
public PlaningPK() {
	super();
}


}
