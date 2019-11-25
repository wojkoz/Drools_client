
package drools_client;

import com.google.gson.Gson;
import drools_client.model.BloodSample;
import drools_client.model.Results;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Utils {

    public static BloodSample generateBloodSample(){
        BloodSample sample = new BloodSample();
        
        Random generator = new Random();
        
        sample.setPredkoscOpadaniaLeukocytow(generator.nextInt(40)+1);
        sample.setProcentHermatokrytu(generator.nextInt(80)+1);
        sample.setStezenieHemoglobiny(generator.nextInt(20)+0.5f);
        sample.setLiczbaBialychKrwinek(generator.nextInt(50000)+1);
        sample.setLiczbaCzerwonychKrwinek(generator.nextInt(65000)+1);
        sample.setLiczbaPlytekKrwi(generator.nextInt(500000)+1);
        
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
