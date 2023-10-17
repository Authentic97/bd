package projet.entities;

public class Medecin extends Personne {
    private String specialite;

    //Attributs navigationnels
    //ManyToONe 
    Rv rv;
    

    public Medecin(int id, String nomComplet) {
        super(id, nomComplet);
    }

    public Medecin(int id, String nomComplet, String specialite) {
        super(id, nomComplet);
        this.specialite = specialite;
    }

    public Rv getRv() {
        return rv;
    }

    public void setRv(Rv rv) {
        this.rv = rv;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((specialite == null) ? 0 : specialite.hashCode());
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
        Medecin other = (Medecin) obj;
        if (specialite == null) {
            if (other.specialite != null)
                return false;
        } else if (!specialite.equals(other.specialite))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Medecin [specialite=" + specialite + ", rv=" + rv + "]";
    }

    
}
