
package drools_client.model;



public class BloodSample {
    private int predkoscOpadaniaLeukocytow; //mm/h
    private int procentHermatokrytu; //%
    private float stezenieHemoglobiny; //g/dl
    private int liczbaBialychKrwinek; //mm^3
    private int liczbaCzerwonychKrwinek; //mm^3
    private int liczbaPlytekKrwi;   //mm^3
    private String plec;
    
    //nowe
    //u/l
    private int alt;
    private int ast;
    private int ggtp;
    private int amylaza;
    private int lipaza;
    //ug/dl
    private int zelazo;
    //%
    private int hct;
    //ul
    private float wbc;
    private float rbc;
    private int plt;
    //-
    private float inr;
    //mg/dl
    private int tc;
    private int ldl;
    private int hdl;
    private int glukoza;
    private float wapn;
    private float fosfor;
    //mg/l
    private float cystatynaC;
    //ng/l
    private int witaminaD;
    private int witaminaB12;
    private float kwasFoliowy;
    //uU/l
    private float tsh;

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getAst() {
        return ast;
    }

    public void setAst(int ast) {
        this.ast = ast;
    }

    public int getGgtp() {
        return ggtp;
    }

    public void setGgtp(int ggtp) {
        this.ggtp = ggtp;
    }

    public int getAmylaza() {
        return amylaza;
    }

    public void setAmylaza(int amylaza) {
        this.amylaza = amylaza;
    }

    public int getLipaza() {
        return lipaza;
    }

    public void setLipaza(int lipaza) {
        this.lipaza = lipaza;
    }

    public int getZelazo() {
        return zelazo;
    }

    public void setZelazo(int zelazo) {
        this.zelazo = zelazo;
    }

    public int getHct() {
        return hct;
    }

    public void setHct(int hct) {
        this.hct = hct;
    }

    public float getWbc() {
        return wbc;
    }

    public void setWbc(float wbc) {
        this.wbc = wbc;
    }

    public float getRbc() {
        return rbc;
    }

    public void setRbc(float rbc) {
        this.rbc = rbc;
    }

    public int getPlt() {
        return plt;
    }

    public void setPlt(int plt) {
        this.plt = plt;
    }

    public float getInr() {
        return inr;
    }

    public void setInr(float inr) {
        this.inr = inr;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getLdl() {
        return ldl;
    }

    public void setLdl(int ldl) {
        this.ldl = ldl;
    }

    public int getHdl() {
        return hdl;
    }

    public void setHdl(int hdl) {
        this.hdl = hdl;
    }

    public int getGlukoza() {
        return glukoza;
    }

    public void setGlukoza(int glukoza) {
        this.glukoza = glukoza;
    }

    public float getWapn() {
        return wapn;
    }

    public void setWapn(float wapn) {
        this.wapn = wapn;
    }

    public float getFosfor() {
        return fosfor;
    }

    public void setFosfor(float fosfor) {
        this.fosfor = fosfor;
    }

    public float getCystatynaC() {
        return cystatynaC;
    }

    public void setCystatynaC(float cystatynaC) {
        this.cystatynaC = cystatynaC;
    }

    public int getWitaminaD() {
        return witaminaD;
    }

    public void setWitaminaD(int witaminaD) {
        this.witaminaD = witaminaD;
    }

    public int getWitaminaB12() {
        return witaminaB12;
    }

    public void setWitaminaB12(int witaminaB12) {
        this.witaminaB12 = witaminaB12;
    }

    public float getKwasFoliowy() {
        return kwasFoliowy;
    }

    public void setKwasFoliowy(float kwasFoliowy) {
        this.kwasFoliowy = kwasFoliowy;
    }

    public float getTsh() {
        return tsh;
    }

    public void setTsh(float tsh) {
        this.tsh = tsh;
    }


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
