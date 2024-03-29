
package drools_client.model;


public class Client {
    private int id;
    private String imie;
    private String nazwisko;
    private java.sql.Date data_urodzenia;
    private String numer_telefonu;
    private String pesel;

    public Client(String imie, String nazwisko, String data_urodzenia, String numer_telefonu, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = java.sql.Date.valueOf(data_urodzenia);
        this.numer_telefonu = numer_telefonu;
        this.pesel = pesel;
    }

    public Client() {
    }

    public java.sql.Date getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(java.sql.Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    
}
