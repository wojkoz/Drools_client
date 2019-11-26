
package drools_client.model;

import java.util.List;

public class Results {
    private List<String> diseases;

    public Results(List diseases) {
        this.diseases = diseases;
    }

    public void addDisease(String tmp){
        diseases.add(tmp);
    }

    public List<String> getDiseases() {
        return diseases;
    }

    public void setDiseases(List diseases) {
        this.diseases = diseases;
    }
    
    public String[] getArray(){
        String[] s = new String[diseases.size()];
        s = diseases.toArray(s);
        return s;
    }
}
