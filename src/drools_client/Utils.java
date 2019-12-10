
package drools_client;

import com.google.gson.Gson;
import drools_client.model.BloodSample;
import drools_client.model.Client;
import drools_client.model.Results;
import java.awt.GridLayout;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Utils {
    
    public static String[][] getData2(BloodSample sample){
        String[][] data = {
            {
                "predkoscOpadaniaLeukocytow", Integer.toString(sample.getPredkoscOpadaniaLeukocytow())
            },
            {
                "procentHermatokrytu", Integer.toString(sample.getProcentHermatokrytu())
            },
            {
                "stezenieHemoglobiny", Float.toString(sample.getStezenieHemoglobiny())
            },
            {
                "liczbaBialychKrwinek", Integer.toString(sample.getLiczbaBialychKrwinek())
            },
            {
                "liczbaCzerwonychKrwinek",Integer.toString(sample.getLiczbaCzerwonychKrwinek())
            },
            {
                "liczbaPlytekKrwi",Integer.toString(sample.getLiczbaPlytekKrwi())
            },
            {
                "plec",sample.getPlec()
            },
            {
                "ALT",Integer.toString(sample.getAlt())
            },
            {
                "AST",Integer.toString(sample.getAst())
            },{
                "GGTP",Integer.toString(sample.getGgtp())
            },{
                "Żelazo",Integer.toString(sample.getZelazo())
            },{
                "Amylaza",Integer.toString(sample.getAmylaza())
            },{
                "Lipaza",Integer.toString(sample.getLipaza())
            },{
                "HCT",Integer.toString(sample.getHct())
            },{
                "WBC",Float.toString(sample.getWbc())
            },{
                "RBC",Float.toString(sample.getRbc())
            },{
                "PLT",Integer.toString(sample.getPlt())
            },{
                "INR",Float.toString(sample.getInr())
            },{
                "TC",Integer.toString(sample.getTc())
            },{
                "LDL",Integer.toString(sample.getLdl())
            },{
                "HDL",Integer.toString(sample.getHdl())
            },{
                "Glukoza",Integer.toString(sample.getGlukoza())
            },{
                "Cystatyna C",Float.toString(sample.getCystatynaC())
            },{
                "Wapń",Float.toString(sample.getWapn())
            },{
                "Fosfor",Float.toString(sample.getFosfor())
            },{
                "Witamina D",Integer.toString(sample.getWitaminaD())
            },{
                "Witamina B12",Integer.toString(sample.getWitaminaB12())
            },{
                "Kwas Foliowy",Float.toString(sample.getKwasFoliowy())
            },{
                "TSH",Float.toString(sample.getTsh())
            }
        };
        return data;
    }
    
    public static String[][] getData(BloodSample sample){
        DATA[0][0] = Integer.toString(sample.getPredkoscOpadaniaLeukocytow());
        DATA[0][1] = Integer.toString(sample.getProcentHermatokrytu());
        DATA[0][2] = Float.toString(sample.getStezenieHemoglobiny());
        DATA[0][3] = Integer.toString(sample.getLiczbaBialychKrwinek());
        DATA[0][4] = Integer.toString(sample.getLiczbaCzerwonychKrwinek());
        DATA[0][5] = Integer.toString(sample.getLiczbaPlytekKrwi());
        DATA[0][6] = sample.getPlec();
        //nowe
        DATA[0][7] = Integer.toString(sample.getAlt());
        DATA[0][8] = Integer.toString(sample.getAst());
        DATA[0][9] = Integer.toString(sample.getGgtp());
        DATA[0][10] = Integer.toString(sample.getZelazo());
        DATA[0][11] = Integer.toString(sample.getAmylaza());
        DATA[0][12] = Integer.toString(sample.getLipaza());
        DATA[0][13] = Integer.toString(sample.getHct());
        DATA[0][14] = Float.toString(sample.getWbc());
        DATA[0][15] = Float.toString(sample.getRbc());
        DATA[0][16] = Integer.toString(sample.getPlt());
        DATA[0][17] = Float.toString(sample.getInr());
        DATA[0][18] = Integer.toString(sample.getTc());
        DATA[0][19] = Integer.toString(sample.getLdl());
        DATA[0][20] = Integer.toString(sample.getHdl());
        DATA[0][21] = Integer.toString(sample.getGlukoza());
        DATA[0][22] = Float.toString(sample.getCystatynaC());
        DATA[0][23] = Float.toString(sample.getWapn());
        DATA[0][24] = Float.toString(sample.getFosfor());
        DATA[0][25] = Integer.toString(sample.getWitaminaD());
        DATA[0][26] = Integer.toString(sample.getWitaminaB12());
        DATA[0][27] = Float.toString(sample.getKwasFoliowy());
        DATA[0][28] = Float.toString(sample.getTsh());
        
        return DATA;
    }
    
    public static final String[] COLUMNS2 = {"predkoscOpadaniaLeukocytow","procentHermatokrytu","stezenieHemoglobiny",
        "liczbaBialychKrwinek","liczbaCzerwonychKrwinek","liczbaPlytekKrwi","plec","ALT","AST","GGTP","Żelazo"
            ,"Amylaza","Lipaza","HCT","WBC","RBC","PLT","INR","TC","LDL","HDL","Glukoza","Cystatyna C","Wapń","Fosfor","Witamina D"
    ,"Witamina B12","Kwas Foliowy","TSH"};
    
    public static final String[] COLUMNS = {"Nazwa Bdania", "Wartosc"};
    
    
    private static final String[][] DATA = new String[1][29];

    public static BloodSample generateBloodSample(){
        BloodSample sample = new BloodSample();
        
        Random generator = new Random();
        
        sample.setPredkoscOpadaniaLeukocytow(generator.nextInt(40)+1);
        sample.setProcentHermatokrytu(generator.nextInt(80)+1);
        sample.setStezenieHemoglobiny(generator.nextInt(20)+0.5f);
        sample.setLiczbaBialychKrwinek(generator.nextInt(50000)+1);
        sample.setLiczbaCzerwonychKrwinek(generator.nextInt(65000)+1);
        sample.setLiczbaPlytekKrwi(generator.nextInt(500000)+1);
        //nowe
        sample.setAlt(generator.nextInt(51));
        sample.setAst(generator.nextInt(50));
        sample.setGgtp(generator.nextInt(60));
        sample.setZelazo(generator.nextInt(210));
        sample.setAmylaza(generator.nextInt(210));
        sample.setLipaza(generator.nextInt(210));
        sample.setHct(generator.nextInt(70));
        sample.setWbc(generator.nextInt(15) + generator.nextFloat());
        sample.setRbc(generator.nextInt(10) + generator.nextFloat());
        sample.setPlt(generator.nextInt(500));
        sample.setInr(generator.nextFloat() + generator.nextFloat());
        sample.setTc(generator.nextInt(250));
        sample.setLdl(generator.nextInt(200));
        sample.setHdl(generator.nextInt(80));
        sample.setGlukoza(generator.nextInt(200));
        sample.setCystatynaC(generator.nextInt(2) + generator.nextFloat());
        sample.setWapn(generator.nextInt(15) + generator.nextFloat());
        sample.setFosfor(generator.nextInt(10) + generator.nextFloat());
        sample.setWitaminaD(generator.nextInt(90));
        sample.setWitaminaB12(generator.nextInt(1500));
        sample.setKwasFoliowy(generator.nextInt(15) + generator.nextFloat());
        sample.setTsh(generator.nextInt(9) + generator.nextFloat());
        
        if(generator.nextInt(2) == 0){
            sample.setPlec("M");
        }else{
            sample.setPlec("K");
        }
        
        return sample;
    }
    
    public static Results postBloodSample(BloodSample sample) {

        final CloseableHttpClient client = HttpClients.createDefault();

        final HttpPost httpPost = new HttpPost("http://127.0.0.1:8080/diag");

        Gson gson = new Gson();

        final String json = gson.toJson(sample);
        Results result = null;
        try {

            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            final CloseableHttpResponse response = client.execute(httpPost);

            System.out.println("Kod odpowiedzi serwera: " + response.getStatusLine().getStatusCode());

            
            
            final String jsonRecived = EntityUtils.toString(response.getEntity());
            result = gson.fromJson(jsonRecived, Results.class);
            client.close();
            
        } catch (UnsupportedEncodingException e) {

            System.out.println("Houston, we have a problem with POST unsupported encoding");
            e.printStackTrace();
        } catch (ClientProtocolException e) {

            System.out.println("Houston, we have a problem with POST client protocol");
            e.printStackTrace();
        } catch (IOException e) {

            System.out.println("Houston, we have a problem with POST input output");
            e.printStackTrace();
        }
        return result;
    }
    
   
}
