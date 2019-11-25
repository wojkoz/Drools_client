
package drools_client;

import drools_client.model.BloodSample;


public class Drools_Client {


    public static void main(String[] args) {
        BloodSample sample = Utils.generateBloodSample();
        
        sample.setPlec("K");
        System.out.println(sample.toString());
        
        System.out.println(Utils.postBloodSample(sample).getDiseases());
    }
    
}
