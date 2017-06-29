package cc.cgp.demo.net;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

public class HttpTest {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("http://wx.chuangyejia.com/mobile/darkHorseTop/duck-horse-top/zambia?id=24");  
		CloseableHttpResponse response = httpclient.execute(httpget);
//		httpget.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
		httpget.addHeader(new BasicHeader("Cookie", "ACCESS_UNIQUE_ID=ezhy0lgztWkzrzrVA2hT1g=="));
		httpget.addHeader(new BasicHeader("Cookie", "_WX=5vtm8loehcsq1m2s513qs6joe1"));
		httpget.addHeader(new BasicHeader("Cookie", "_csrf=1c6733f8df84dd0197cf7887f3b5eefa74bf59f0fc6c575bb7b9edd0d65e0035a%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22mW_HEnnE7EWvzFvheKRECoXyt9bQWdMJ%22%3B%7D"));
		
//		; _WX=kebq1rjmclpt3cq6esr6u62s11; _csrf=1cceed03ea98fc5e0cd94fb76590318317dcde2a269254c505504fb32f54eb23a%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22ggT_vH4BmBDflS_sWXQdRFUzJMIpYgIT%22%3B%7D
		HttpEntity entity = response.getEntity();  
        if (entity != null) {  
            // long len = entity.getContentLength();// -1 表示长度未知  
            String result = EntityUtils.toString(entity);  
            response.close();  
            // httpClient.close();  
            System.out.println(result);
        }  
       
		
	}
}
