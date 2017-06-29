/**
 * 
 * 
 * SDK使用的一些说明，
Some instructions for using SDK,

这个SDK里的网络请求是用JAVA的API"HttpsURLConnection"写的，自己封装的一些网络请求，所以强烈建议使用第三方框架来调用我们的API
The network request in this SDK is written with JAVA API "HttpsURLConnection", some of its own network request package, it is recommended to use the third party framework to call our API


SDK里的几个类
Several classes in SDK

Response 这是一个网络请求的结果类，网络请求的结果封装在里面，包括返回的状态码和返回的信息
Response: This is a result of a class of network requests, the results of the network package is included in the request, including the return of the state code stuta and return information content


CommonOperate 封装了detect，compare，search这三个接口
CommonOperate: encapsulates the detect, compare, search these three interfaces


FaceSetOperate FaceSet相关的操作
FaceSetOperate:FaceSet related operations


FaceOperate Face相关的操作
FaceOperate:Face related operations

CardOperate 封装了证件识别的接口，使用国际版请忽视这个类
CardOperate: interface for document identification，please ignore if you are use international version

ImageOperate 图片识别接口的封装，使用国际版请忽视这个类
ImageOperate: image recognition interface package，please ignore if you are use international version

BodyOperate 封装了人体检测和人像扣图的功能
BodyOperate:HumanBody Detect and HumanBody Segment

HttpRequest 这里面封装了网络请求
HttpRequest: This is a network request

Key 这里面定义了一些字段
Key: here are some fields defined

具体的参数说明及方法功能请看每个方法的注释
Specific parameters and methods to see the function of each method notes
 * 
 * cc.cgp.demo.app.faceplus.FaceUtils.java
 * 2017年6月8日 下午8:20:09 by cgp
 */
package cc.cgp.demo.app.faceplus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.boot.json.JacksonJsonParser;

import com.megvii.cloud.http.CommonOperate;
import com.megvii.cloud.http.FaceOperate;
import com.megvii.cloud.http.FaceSetOperate;
import com.megvii.cloud.http.Response;

import cc.cgp.demo.Application;

/**
 * cc.cgp.demo.app.faceplus.FaceUtils.java 2017年6月8日 下午8:20:09 by cgp
 */
public class FaceUtils {
	// face++ appkey for test
//	public static String APPKEY = "b92bDga59Z1-z3k7xTK7S7PnVJ368wmx";
	// face++ secret
//	public static String SECRET = "y6NN7APJyThJyHLaJpiMh4ZZM2j2T-MA";
	
	// face++ appkey for online
	public static String APPKEY = "NTnZSCdpOm4YsjO8dwKHJj_M-o9XORx4";
	// face++ secret
	public static String SECRET = "r3WAR8XnwwORcrJWTtRv-w_J4AiQbo8s";
	
	
	// 是否国际版 默认为否
	public static boolean ISINTERNATIONALVERION = false;
	// 获取FaceSet辅助操作类
	public static FaceSetOperate fso = new FaceSetOperate(APPKEY, SECRET, ISINTERNATIONALVERION);
	// 获取Face辅助操作类
	public static FaceOperate fo = new FaceOperate(APPKEY, SECRET, ISINTERNATIONALVERION);
	// 获取一些通用辅助类
	public static CommonOperate co = new CommonOperate(APPKEY, SECRET, ISINTERNATIONALVERION);

	private static Logger logger = Logger.getLogger(FaceUtils.class);
	
	/**
	 * 创建指定全局唯一名称的faceSet；无对应tag
	 * 
	 * @param faceSetName
	 * @return 2017年6月8日 下午8:31:46 by cgp
	 */
	public static Response createFaceSet(String faceSetName) {
		return createFaceset(faceSetName, null);

	}

	/**
	 * 创建指定tag和全局唯一名称的faceSet
	 * 
	 * @param faceSetName
	 * @param faceSetTagName
	 * @return 2017年6月8日 下午8:38:37 by cgp
	 */
	public static Response createFaceset(String faceSetName, String faceSetTagName) {
		Response rs_facesetCreate = null;
		if (faceSetTagName == null || faceSetTagName.isEmpty()) {
			faceSetTagName = "";
		}
		try {
			rs_facesetCreate = fso.createFaceSet(faceSetName, faceSetName, faceSetTagName, "", "this is a faceset NO 2",
					1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs_facesetCreate;

	}

	/**
	 * 获取所有FaceSet列表
	 * 
	 * @return 2017年6月8日 下午8:23:18 by cgp
	 * @throws Exception
	 */
	public static Response getFaceSetList() throws Exception {
		return getFaceSetListByTag("");
	}

	/**
	 * 获取指定tag的FaceSet列表
	 * 
	 * @param tag
	 * @return 2017年6月8日 下午8:24:12 by cgp
	 * @throws Exception
	 */
	public static Response getFaceSetListByTag(String tag) throws Exception {
		Response rs_facesetList = fso.getFaceSets(tag);
		return rs_facesetList;
	}

	/**
	 * 获取指定名的faceSet的详细信息
	 * 
	 * @param faceSetName
	 * @return 2017年6月8日 下午8:49:25 by cgp
	 * @throws Exception
	 * 
	 */
	public static Response getFaceSet(String faceSetName) throws Exception {
		FaceSetOperate fso = new FaceSetOperate(APPKEY, SECRET, ISINTERNATIONALVERION);
		Response rs_facesetDetail = fso.getDetailByOuterId(faceSetName);
		return rs_facesetDetail;
	}

	/**
	 * 在指定faceSetNamed的faceSet中，增加一个face
	 * 
	 * @param faceSet
	 * @param face
	 * @return 2017年6月8日 下午8:29:13 by cgp
	 */
	public static Response addFaceInFaceSet(String faceSetName, String faceToken) throws Exception {
		return fso.addFaceByOuterId(faceToken, faceSetName);
	}
	
	/**
	 * 给指定faceToken的face绑定userId后加入到指定名为faceSetName的faceSet中
	 * @param faceSetName
	 * @param faceToken
	 * @param userId
	 * @return
	 * @throws Exception 2017年6月9日 下午5:25:07 by cgp
	 */
	public static Response addFaceInFaceSet(String faceSetName, String faceToken,String userId) throws Exception {
		setFaceUserId(faceToken,userId);
		return addFaceInFaceSet(faceSetName, faceToken);
	}
	
	/**
	 * 给指定url的图片，绑定对应userid，加入到指定faceSet中
	 * @param faceSetName
	 * @param imgUrl
	 * @param userId
	 * @return
	 * @throws Exception 2017年6月9日 下午6:01:01 by cgp
	 */
	public static Response addImgInFaceSet(String faceSetName, String imgUrl,String userId) throws Exception {
		String faceToken =  getFaceTokenByImg(imgUrl);
		logger.debug(" getFaceTokenByImg ::  faceToken is "+faceToken);
		return addFaceInFaceSet(faceSetName, faceToken, userId);
	}
	
	/**
	 * 清除指定faceset中的所有face
	 * @param faceSetName
	 * @return
	 * @throws Exception 2017年6月9日 下午6:28:29 by cgp
	 */
	public static Response faceSetClear(String faceSetName) throws Exception{
		return faceSetRemoveFace(faceSetName, "RemoveAllFaceTokens");
	}
	
	/**
	 * 移除指定faceSet中的指定token的face；token可以多个，用逗号分隔
	 * 最多不能超过1,000个face_token
	 * @param faceSetName
	 * @param faceTokens
	 * @return
	 * @throws Exception 2017年6月9日 下午6:27:32 by cgp
	 */
	public static Response faceSetRemoveFace(String faceSetName,String faceTokens) throws Exception{
		return fso.removeFaceFromFaceSetByOuterId(faceSetName, faceTokens);
	}

	/**
	 * 通过token获取对应face详细信息
	 * 
	 * @param faceToken
	 * @return 2017年6月8日 下午8:55:49 by cgp
	 * @throws Exception
	 */
	public static Response getFaceByToken(String faceToken) throws Exception {
		return fo.faceGetDetail(faceToken);
	}

	/**
	 * 给指定faceToken对应的face设置userId
	 * 
	 * @param faceToken
	 * @param userId
	 * @return
	 * @throws Exception
	 *             2017年6月8日 下午8:59:03 by cgp
	 */
	public static Response setFaceUserId(String faceToken, String userId) throws Exception {
		return fo.faceSetUserId(faceToken, userId);
	}
	
	/**
	 * 通过指定imgUrl识别出face后，设置对应的userId
	 * @param imgUrl
	 * @param userID
	 * @return
	 * @throws Exception 2017年6月9日 下午5:17:52 by cgp
	 */
	private static Response setImgUserId(String imgUrl,String userId) throws Exception{
		String faceToken = getFaceTokenByImg(imgUrl);
		if(faceToken!=null && !faceToken.isEmpty()){
			return setFaceUserId(faceToken,userId);
		}
		return null;
	}

	public static String addImgWithUserId(String imgUrl,String userId) throws Exception{
		String faceToken = getFaceTokenByImg(imgUrl);
		if(faceToken!=null && !faceToken.isEmpty()){
//			return setFaceUserId(faceToken,userId);
		}
		return null;
	}
	
	
	/**
	 * 通过指定图片url获取其中的face
	 * 
	 * @param url
	 * @return 2017年6月8日 下午9:06:45 by cgp
	 * @throws Exception
	 */
	private static Response getFaceByImg(String url) throws Exception {
		return co.detectUrl(url, 0, "");
	}

	public static String getFaceTokenByImg(String url) throws Exception{
		Response response = getFaceByImg(url);
		JacksonJsonParser aJacksonJsonParser = new JacksonJsonParser();
		Map map = aJacksonJsonParser.parseMap(getResponseStr(response));
		List<Map<String,String>> list = (List<Map<String, String>>) map.get("faces");
		if(list!=null && list.size()>0){
			return list.get(0).get("face_token");
		}
		return "";
	}
	
	/**
	 * 通过faceToken 比较两个face
	 * 
	 * @param faceTokenFirst
	 * @param faceTokenSecond
	 * @return
	 * @throws Exception
	 *             2017年6月8日 下午9:12:30 by cgp
	 */
	public static Response compareFaceByFaceToken(String faceTokenFirst, String faceTokenSecond) throws Exception {
		return co.compare(faceTokenFirst, null, null, null, faceTokenSecond, null, null, null);
	}
	
	/**
	 * 通过图片url在指定faceset中搜索
	 * @param url
	 * @param faceSetName
	 * @return
	 * @throws Exception 2017年6月9日 下午4:49:12 by cgp
	 */
	public static Response searchImgInFaceSet(String url,String faceSetName) throws Exception{
		return co.searchByOuterId(null, url, null, faceSetName, 2);
	}
	
	/**
	 * 通过faceToken在指定faceset中搜索
	 * @param faceToken
	 * @param faceSetName
	 * @return
	 * @throws Exception 2017年6月9日 下午4:48:30 by cgp
	 */
	public static Response searchFaceInFaceSet(String faceToken,String faceSetName) throws Exception{
		return co.searchByOuterId(faceToken, null, null, faceSetName, 1);
	}

	/**
	 * 在控制台输出response内容
	 * 
	 * @param response
	 *            2017年6月8日 下午9:02:59 by cgp
	 */
	public static void printResponse(Response response) {
		System.out.println(getResponseStr(response));
	}
	
	/**
	 * 获取response 内容字符串
	 * @param response
	 * @return 2017年6月8日 下午10:09:29 by cgp
	 */
	public static String getResponseStr(Response response) {
		if (response != null) {
			return new String(response.getContent());
		}else{
			return "";
		}
	}

	public static void main(String[] args) throws Exception {
		Response response = null;

		// 获取所有faceSet
//		 response = getFaceSetList();
		/*
		 * "outer_id": "mokofaceset001","mokofaceset002","mokofaceset003",
		 * "tags": "facesettag001",""
		 */

		// 获取tag为facesettag001 的faceSet
//		 response = getFaceSetListByTag("facesettag001");
		/*
		 * "outer_id": "mokofaceset001","mokofaceset002" "tags": "facesettag001"
		 */

		// 创建一个空的faceSet
//		 response = createFaceSet("mtbFaceSet");
//		 printResponse(response);
		/*
		 * "faceset_token": "b4fef6d87bbc6a12617946e80875b190" "outer_id":
		 * "mokofaceset000"
		 */

//		response = getFaceSet("mokofaceset001");
//		printResponse(response);
//		response = faceSetClear("mokofaceset001");
		// response =
		// getFaceByImg("http://img.mb.moko.cc/2017-03-28/c2377b96-9933-4967-93bd-dc6215bb4598.jpg");
		// 0eec3ecdbe20c12ca695063737a4212b

		// 在faceset中增加一个face
		// response =
		// addFace("mokofaceset000","0eec3ecdbe20c12ca695063737a4212b");
		// "faceset_token": "b4fef6d87bbc6a12617946e80875b190", "face_count": 1,
		// "face_added": 1
//		 response = getFaceByToken("2e0e6a5071258e8abf23b531ce396dcf");
		
//		response = getFaceByImg("https://static.moko.cc/is_static/site/images/singleQuote/10.jpg");
//
	
//		String faceToken = getFaceTokenByImg("http://img.mb.moko.cc/2017-02-05/3b19b695-6756-48d5-89bc-9e828c34d5ac.jpg");
//		System.out.println("faceToken : " + faceToken);
//		response = addFace("mokofaceset000", faceToken);
		
//		response = searchFaceInFaceSet("0eec3ecdbe20c12ca695063737a4212b", "mokofaceset000");
//		response = searchImgInFaceSet("http://img.mb.moko.cc/2017-03-26/ca37d84f-7485-4229-8c6a-d6d1ff29911c.jpg", "mokofaceset000");
		
		String imgUrl = "http://img.mb.moko.cc/2017-05-11/77b56e02-0f12-4c9b-b02f-318c182b1901.jpg";
		String userid = "3337125";
		response = addImgInFaceSet("mtbFaceSet",imgUrl ,userid);
		printResponse(response);
		response = getFaceSet("mtbFaceSet");
//		printResponse(response);
//		faceSetRemoveFace("mokofaceset001", "6c2348f2d492b759431f9e2720216953,cc08ad56b247430653dbadb890152728");
		printResponse(response);
//		System.out.println(getFaceTokenByImg("http://img.mb.moko.cc/2017-03-23/f046ee38-4a0e-46f6-a15d-ff2eef1a63e1.jpg"));

//		JacksonJsonParser aJacksonJsonParser = new JacksonJsonParser();
//		Map map = aJacksonJsonParser.parseMap(getResponseStr(response));
//		System.out.println(map.toString());
//		List<Map<String,String>> arrays = (List<Map<String,String>>)map.get("facesets");
//		String faceSetToken = arrays.get(0).get("faceset_token");
//		System.out.println(faceSetToken);
	}

}
