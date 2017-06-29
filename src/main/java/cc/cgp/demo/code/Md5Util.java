/**
 * cc.cgp.demo.code.Md5Util.java
 * 2017年6月20日 上午11:53:00 by cgp
 */
package cc.cgp.demo.code;

import java.security.MessageDigest;

import org.apache.log4j.Logger;

/**
 * cc.cgp.demo.code.Md5Util.java
 * 2017年6月20日 上午11:53:00 by cgp
 */
public class Md5Util {
	private static final Logger log = Logger.getLogger(Md5Util.class);
	public static String getMCKey(String str) {
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes("UTF-8"));
			result = toHexString(md.digest());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return result;
	}
	public static String toHexString(byte[] bytes) {
		StringBuffer sb = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			sb.append(Character.forDigit((bytes[i] & 0XF0) >> 4, 16));
			sb.append(Character.forDigit(bytes[i] & 0X0F, 16));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "SELECT content FROM forbid";
		log.info(getMCKey(str));
	}
}

