
package drools_client.model;

import java.util.List;

public class Results {
    private List<String> diseases;
    
    private List<String> tests;
    
    public List getTests() {
        return tests;
    }

    public void setTests(List tests) {
        this.tests = tests;
    }

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
    public String[] getTestArray(){
        String[] s = new String[tests.size()];
        s = tests.toArray(s);
        return s;
    }

    @Override
    public String toString() {
        String r = diseases.toString().substring(1).replace("]", "");
        return r;
    }
    
    
}
