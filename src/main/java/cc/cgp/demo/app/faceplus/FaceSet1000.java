/**
 * cc.cgp.demo.app.faceplus.FaceSet1000.java
 * 2017年6月9日 上午10:25:24 by cgp
 */
package cc.cgp.demo.app.faceplus;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.megvii.cloud.http.Response;

/**
 * cc.cgp.demo.app.faceplus.FaceSet1000.java 2017年6月9日 上午10:25:24 by cgp
 */
@Service
public class FaceSet1000 {
	private static Logger logger = Logger.getLogger(FaceSet1000.class);
	@Autowired
	@Qualifier("mysqlJDBCTempleA")
	private JdbcTemplate jta;

	public List<Map<String, Object>> getMtbUserImgList() {
		return jta.queryForList(
				"select index_img,id,userid from mtb_userinfo where index_img like 'http://img.mb%'  and id>=18480 and id <18560 order by id desc ");
	}

	/**
	 * 2017年6月9日 下午2:30:49 by cgp
	 * 
	 */
	public void test() {
		try {
			List<Map<String, Object>> list = getMtbUserImgList();
			int count = 0;
			for (Map<String, Object> map : list) {
				String imgUrl = map.get("index_img").toString();
				String id =  map.get("id").toString();
				String userid =  map.get("userid").toString();
				logger.info(count++ + "  :  userId :" + userid + " id : " + id);
//				指定图片中的face及对应userid绑定后加入到mtbFaceSet中，要求mtbFaceSet存在；
				FaceUtils.addImgInFaceSet( "mtbFaceSet",imgUrl ,userid);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
