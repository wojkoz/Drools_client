
package drools_client.model;

import java.sql.Date;


public class Employee {
    private int id;
    private String imie;
    private String nazwisko;
    private java.sql.Date data_urodzenia;
    private String stanowisko;

    public Employee(String imie, String nazwisko, String data_urodzenia , String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.data_urodzenia = java.sql.Date.valueOf(data_urodzenia);
    }

    public Date getData_urodzenia() {
        return data_urodzenia;
    }

    public Employee() {
    }

    public void setData_urodzenia(Date data_urodzenia) {
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

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    
}
