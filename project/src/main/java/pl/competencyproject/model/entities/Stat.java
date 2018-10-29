package pl.competencyproject.model.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STATS")
public class Stat {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idStats;

    private int idUser;

    private int idLevel;

    @Temporal(TemporalType.TIMESTAMP)
    Date dateInput;

    private double valueProgres;

    public Stat() {
    }

    public Stat(int idUser, int idLevel, double valueProgres) {
        this.idUser = idUser;
        this.idLevel = idLevel;
        this.dateInput = new Date();
        this.valueProgres = valueProgres;
    }


    public int getIdStats() {
        return idStats;
    }

    public void setIdStats(int idStats) {
        this.idStats = idStats;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public Date getDateInput() {
        return dateInput;
    }

    public void setDateInput(Date dateInput) {
        this.dateInput = dateInput;
    }

    public double getValueProgres() {
        return valueProgres;
    }

    public void setValueProgres(double valueProgres) {
        this.valueProgres = valueProgres;
    }

}