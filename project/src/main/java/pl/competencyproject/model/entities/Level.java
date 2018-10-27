package pl.competencyproject.model.entities;

import javax.persistence.*;

@Entity
@Table(name ="LEVELS")
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLevel;

    private String levelName;

    private String categorie;

    public Level(String levelName, String categorie) {
        this.levelName = levelName;
        this.categorie = categorie;
    }

    public Level() {
    }

    public int getIdLevel() {
        return idLevel;
    }

    public String getLevelName() {
        return levelName;
    }

    public String getCategorie() {
        return categorie;
    }
}
