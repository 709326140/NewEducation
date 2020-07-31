package cn.xjy.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SendSMS {

	public static String sendCode(String phone,int code) throws ServerException, ClientException {
		   DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIfDWUiP4DbMWM", "4yEuVbHHO5AxwFbD27lSojYpg8myee");
	       IAcsClient client = new DefaultAcsClient(profile);
	       DefaultProfile.addEndpoint("cn-hangzhou", "Dysmsapi", "dysmsapi.aliyuncs.com");
	       //创建短信发�?�服务的请求对象
           SendSmsRequest request = new SendSmsRequest();
           request.setMethod(MethodType.POST);
           request.setVersion("2017-05-25");
           request.setPhoneNumbers(phone);
           request.setSignName("喵喵玩玩");
           request.setTemplateCode("SMS_171111785");//${code}
           request.setTemplateParam("{\"code\":"+code+"}");
           //创建短信服务的响应对�?
           SendSmsResponse response = client.getAcsResponse(request);
           if(response.getCode()!= null && response.getCode().equals("OK")) {
        	   return "发�?�成�?!";
           }else {
        	   // getMessage() :返回造成发�?�失败的文本错误信息
        	   return response.getMessage();
           }	       
	}
	     

}
