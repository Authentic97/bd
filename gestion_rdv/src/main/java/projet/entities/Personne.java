package projet.entities;

public class Personne {
    protected int id;
    protected String nomComplet;

    //Constructeur sans arguments
    public Personne() {
    }

    //Constructeur avec arguments
    public Personne(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }
    
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Override
    public String toString() {
        return "Personne [id=" + id + ", nomComplet=" + nomComplet + "]";
    }
}
