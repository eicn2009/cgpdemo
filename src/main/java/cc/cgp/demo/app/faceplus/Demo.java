package cc.cgp.demo.app.faceplus;

import com.megvii.cloud.http.CommonOperate;
import com.megvii.cloud.http.FaceOperate;
import com.megvii.cloud.http.FaceSetOperate;
import com.megvii.cloud.http.HttpRequest;
import com.megvii.cloud.http.Key;
import com.megvii.cloud.http.Response;

/**
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
 * 
 * 
 * @author cgp
 *
 */
public class Demo {
	
	
	public static void main(String[] args) throws Exception {
//		faceset相关操作
//		FaceSetOperate fso = new FaceSetOperate(FaceConstant.APPKEY, FaceConstant.SECRET, FaceConstant.ISINTERNATIONALVERION);
		
		
//		建立faceset
//		Response rs_facesetCreate = fso.createFaceSet("faceset for test", "mokofaceset002", "facesettag001", "cc08ad56b247430653dbadb890152728,6c2348f2d492b759431f9e2720216953", "this is a faceset NO 2", 1);
//		Response rs_facesetCreate1 = fso.createFaceSet("faceset for test", "mokofaceset003", null, "cc08ad56b247430653dbadb890152728,6c2348f2d492b759431f9e2720216953", "this is a faceset NO 2", 1);
//		System.out.println(new String( rs_facesetCreate.getContent()));
//		System.out.println(new String( rs_facesetCreate1.getContent()));
//		{"faceset_token": "8074185f6158be2be516d94c13eb78b3", "time_used": 527, "face_count": 2, "face_added": 2, "request_id": "1496311835,17de4ccf-ba54-4c10-8281-be931b354db2", "outer_id": "mokofaceset001", "failure_detail": []}
//		{"faceset_token": "1a73004a753083f3077b3e34a0395412", "time_used": 590, "face_count": 2, "face_added": 2, "request_id": "1496389707,d56e629d-a01c-4072-973b-463a7a4eb484", "outer_id": "mokofaceset002", "failure_detail": []}
//		{"faceset_token": "5af97bb3abd0f1db91c4c3942554b5f9", "time_used": 500, "face_count": 2, "face_added": 2, "request_id": "1496389708,a49628c5-78fe-4c9d-913b-c4a250046eb5", "outer_id": "mokofaceset003", "failure_detail": []}
//		获取faceset列表 		
//		Response rs_facesetList = fso.getFaceSets("facesettag001");
//		System.out.println(new String( rs_facesetList.getContent()));
//		{"time_used": 94, "facesets": [{"faceset_token": "8074185f6158be2be516d94c13eb78b3", "outer_id": "mokofaceset001", "display_name": "K\ufffd(faceset", "tags": "facesettag001"}, {"faceset_token": "1a73004a753083f3077b3e34a0395412", "outer_id": "mokofaceset002", "display_name": "faceset for test", "tags": "facesettag001"}], "request_id": "1496389708,7b312e9b-1989-41f5-a62b-dd392393b113"}
//		传入""表示获取所有faceset列表	
//		Response rs_facesetList1 = fso.getFaceSets("");
//		System.out.println(new String( rs_facesetList1.getContent()));
//		{"time_used": 34, "facesets": [], "request_id": "1496389708,e568e44b-184d-4723-9f3e-d44a26824d9f"}
//		{"time_used": 30, "facesets": [{"faceset_token": "8074185f6158be2be516d94c13eb78b3", "outer_id": "mokofaceset001", "display_name": "K\ufffd(faceset", "tags": "facesettag001"}, {"faceset_token": "1a73004a753083f3077b3e34a0395412", "outer_id": "mokofaceset002", "display_name": "faceset for test", "tags": "facesettag001"}, {"faceset_token": "5af97bb3abd0f1db91c4c3942554b5f9", "outer_id": "mokofaceset003", "display_name": "faceset for test", "tags": ""}], "request_id": "1496389849,0ed25324-ffc1-47b8-b7e7-a9642c1c3637"}
//		{"time_used": 37, "error_message": "INVALID_OUTER_ID", "request_id": "1496311451,87ea0714-7fb0-4aee-83a2-65f10cbbcade"}
//		获取对应faceset相关信息
//		Response rs_facesetDetail = fso.getDetailByOuterId("mokofaceset001");
//		System.out.println(new String( rs_facesetDetail.getContent()));
//		{"faceset_token": "8074185f6158be2be516d94c13eb78b3", "tags": "facesettag001", "time_used": 56, "user_data": "this is a faceset", "display_name": "K\ufffd(faceset", "face_tokens": ["6c2348f2d492b759431f9e2720216953", "cc08ad56b247430653dbadb890152728"], "face_count": 2, "request_id": "1496311879,1085e915-af5d-4887-b124-661c8ab2f227", "outer_id": "mokofaceset001"}

		
//		FaceOperate fo = new FaceOperate(FaceConstant.APPKEY, FaceConstant.SECRET, FaceConstant.ISINTERNATIONALVERION);
//		System.out.println(new String(fo.faceGetDetail("cc08ad56b247430653dbadb890152728").getContent()));
//		fo.faceSetUserId("cc08ad56b247430653dbadb890152728", "userid000001");
//		System.out.println(new String(fo.faceGetDetail("cc08ad56b247430653dbadb890152728").getContent()));
//		{"user_id": "", "time_used": 159, "request_id": "1496390920,6c0b7fb2-016f-4956-b67d-d87dfc112dd9", "image_id": "xbwkpOUAOyT35Ysp16E2Dw==", "face_rectangle": {"width": 76, "top": 179, "left": 302, "height": 76}, "facesets": [{"faceset_token": "8074185f6158be2be516d94c13eb78b3", "outer_id": "mokofaceset001", "tags": ["facesettag001"]}, {"faceset_token": "1a73004a753083f3077b3e34a0395412", "outer_id": "mokofaceset002", "tags": ["facesettag001"]}, {"faceset_token": "5af97bb3abd0f1db91c4c3942554b5f9", "outer_id": "mokofaceset003", "tags": []}], "face_token": "cc08ad56b247430653dbadb890152728"}
//		{"user_id": "userid000001", "time_used": 48, "request_id": "1496390920,24468d0f-788c-4bcd-b105-8ede3c532626", "image_id": "xbwkpOUAOyT35Ysp16E2Dw==", "face_rectangle": {"width": 76, "top": 179, "left": 302, "height": 76}, "facesets": [{"faceset_token": "8074185f6158be2be516d94c13eb78b3", "outer_id": "mokofaceset001", "tags": ["facesettag001"]}, {"faceset_token": "1a73004a753083f3077b3e34a0395412", "outer_id": "mokofaceset002", "tags": ["facesettag001"]}, {"faceset_token": "5af97bb3abd0f1db91c4c3942554b5f9", "outer_id": "mokofaceset003", "tags": []}], "face_token": "cc08ad56b247430653dbadb890152728"}

//		CommonOperate co = new CommonOperate(FaceConstant.APPKEY, FaceConstant.SECRET, FaceConstant.ISINTERNATIONALVERION);
//		Response response = co.detectUrl("http://img.mb.moko.cc/2017-05-19/39cbdbc1-f402-45a4-a1d1-cfdc96d2fdc5.jpg?imageView2/2/h/673/q/85", 1, "gender,age,smiling,glass,headpose,facequality,blur");
//		System.out.println(new String( response.getContent()));
//		Response response1 = co.compare("cc08ad56b247430653dbadb890152728", null, null, null, "6c2348f2d492b759431f9e2720216953", null, null, null);
//		System.out.println(new String( response1.getContent()));
//		 co.compare("cc08ad56b247430653dbadb890152728", null, null, null, "6c2348f2d492b759431f9e2720216953", null, null, null);
//		{"confidence": 79.564, "request_id": "1496310342,95cd337e-7e79-488d-96d0-d620b2b1ab0e", "time_used": 302, "thresholds": {"1e-3": 65.3, "1e-5": 76.5, "1e-4": 71.8}}
	}
}
