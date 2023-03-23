package ca.qc.bdeb.demo06;

public class Film {
    private int id;
    private String titre;
    private int anneeRealisation;

    public Film() {
    }

    public Film(int id, String titre, int anneeRealisation) {
        this.id = id;
        this.titre = titre;
        this.anneeRealisation = anneeRealisation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeRealisation() {
        return anneeRealisation;
    }

    public void setAnneeRealisation(int anneeRealisation) {
        this.anneeRealisation = anneeRealisation;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", anneeRealisation=" + anneeRealisation +
                '}';
    }
}
