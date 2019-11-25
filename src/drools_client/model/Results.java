
package drools_client.model;

import java.util.List;

public class Results {
    private List diseases;

    public Results(List diseases) {
        this.diseases = diseases;
    }

    public void addDisease(String tmp){
        diseases.add(tmp);
    }

    public List getDiseases() {
        return diseases;
    }

    public void setDiseases(List diseases) {
        this.diseases = diseases;
    }
}
