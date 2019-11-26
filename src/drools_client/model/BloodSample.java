
package drools_client.model;



public class BloodSample {
    private int predkoscOpadaniaLeukocytow; //mm/h
    private int procentHermatokrytu; //%
    private float stezenieHemoglobiny; //g/dl
    private int liczbaBialychKrwinek; //mm^3
    private int liczbaCzerwonychKrwinek; //mm^3
    private int liczbaPlytekKrwi;   //mm^3
    private String plec;

    @Override
    public String toString() {
        return "BloodSample{" + "predkoscOpadaniaLeukocytow=" + predkoscOpadaniaLeukocytow + ", procentHermatokrytu=" + procentHermatokrytu + ", stezenieHemoglobiny=" + stezenieHemoglobiny + ", liczbaBialychKrwinek=" + liczbaBialychKrwinek + ", liczbaCzerwonychKrwinek=" + liczbaCzerwonychKrwinek + ", liczbaPlytekKrwi=" + liczbaPlytekKrwi + ", plec=" + plec + '}';
    }
    
    
    
    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public int getPredkoscOpadaniaLeukocytow() {
        return predkoscOpadaniaLeukocytow;
    }

    public void setPredkoscOpadaniaLeukocytow(int predkoscOpadaniaLeukocytow) {
        this.predkoscOpadaniaLeukocytow = predkoscOpadaniaLeukocytow;
    }

    public int getProcentHermatokrytu() {
        return procentHermatokrytu;
    }

    public void setProcentHermatokrytu(int procentHermatokrytu) {
        this.procentHermatokrytu = procentHermatokrytu;
    }

    public float getStezenieHemoglobiny() {
        return stezenieHemoglobiny;
    }

    public void setStezenieHemoglobiny(float stezenieHemoglobiny) {
        this.stezenieHemoglobiny = stezenieHemoglobiny;
    }

    public int getLiczbaBialychKrwinek() {
        return liczbaBialychKrwinek;
    }

    public void setLiczbaBialychKrwinek(int liczbaBialychKrwinek) {
        this.liczbaBialychKrwinek = liczbaBialychKrwinek;
    }

    public int getLiczbaCzerwonychKrwinek() {
        return liczbaCzerwonychKrwinek;
    }

    public void setLiczbaCzerwonychKrwinek(int liczbaCzerwonychKrwinek) {
        this.liczbaCzerwonychKrwinek = liczbaCzerwonychKrwinek;
    }

    public int getLiczbaPlytekKrwi() {
        return liczbaPlytekKrwi;
    }

    public void setLiczbaPlytekKrwi(int liczbaPlytekKrwi) {
        this.liczbaPlytekKrwi = liczbaPlytekKrwi;
    }
}
