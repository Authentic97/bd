package projet.entities;

import java.util.ArrayList;

public class Patient extends Personne {
    private ArrayList<String> antecedents = new ArrayList<>();

    //Attributs navigationnel
    //ManyToOne
    Rv rv;

    public Patient(int id, String nomComplet) {
        super(id, nomComplet);
    }

    public Patient(int id, String nomComplet, ArrayList<String> antecedents) {
        super(id, nomComplet);
        this.antecedents = antecedents;
    }

    public Rv getRv() {
        return rv;
    }

    public void setRv(Rv rv) {
        this.rv = rv;
    }

    public ArrayList<String> getAntecedents() {
        return antecedents;
    }

    public void setAntecedents(ArrayList<String> antecedents) {
        this.antecedents = antecedents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((antecedents == null) ? 0 : antecedents.hashCode());
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
        Patient other = (Patient) obj;
        if (antecedents == null) {
            if (other.antecedents != null)
                return false;
        } else if (!antecedents.equals(other.antecedents))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Patient [antecedents=" + antecedents + "]";
    }

}
