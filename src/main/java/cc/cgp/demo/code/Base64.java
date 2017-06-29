package cc.cgp.demo.code;

import java.io.IOException;

public class Base64 {
    /**  
     * 编码  
     * @param bstr  
     * @return String  
     */    
    public static String encode(byte[] bstr){    
    return new sun.misc.BASE64Encoder().encode(bstr);    
    }    
    
    /**  
     * 解码  
     * @param str  
     * @return string  
     */    
    public static byte[] decode(String str){    
    byte[] bt = null;    
    try {    
        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();    
        bt = decoder.decodeBuffer( str );    
    } catch (IOException e) {    
        e.printStackTrace();    
    }    
    
        return bt;    
    }    
    
    public static void main(String[] args) {
		byte[] t = decode("5ZeG5QLsMOuu6iluVM3MPrnadMdSZLxgIaSJMmHL9Sht8sQ2VwIrpzrd8Mdsce-MP_n-dSr1oEa1Of2k9y0JYIECEu06u_C-zisz5dxBTCi-Mg5dNtdSaz9eoX6knCzSJbBiUeKYtYqTdT0wM6ol3eGr_s8wRM9WNufrZdugzEhLtgncsVjVdESETed7ag2im3atco9YtvskwUa2mw-T3rR7HCnb6ua6Bb7GtWKTGqA0uuq1zN2XuIFFhiYNGRemZw0GU-R0ofRRZNp7YCrQW5NlFcsFRuF0mqHz1AYWvA5rJXAJwsxC8mo6ppzvrmgQ-VHLvgaBb1vzOgET8QW0-bnX62p6RkZFR_2bwySH7E6AHUFlGIlmDItAJNoC6Pb1bo_zPJ3uos3wmmUD_2yH7UmE5X0bUq-ntwGO_ZdUKqnfNfuI7rJKwyBr8LxBFPnMtLlj-hlHWA36XZT6IaelYYF-iighm2LEm7DPRVb-I-SiLU7ZflK7xBzItk61cirpcCRN5E3IyKWL1fBjNWbvzmYMnzeKqsH4juX2f5ltqogCpQUs");
		System.out.println(new String(t));
		
		String s = "Hello World";
		byte[] b = s.getBytes();
		String es = encode(b);
		System.out.println(es);
		
	}
}
