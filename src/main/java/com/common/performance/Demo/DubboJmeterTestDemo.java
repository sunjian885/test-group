package com.common.performance.Demo;

import com.alibaba.fastjson.JSONObject;
import com.common.performance.utils.SpringContext;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.springframework.context.ApplicationContext;

public class DubboJmeterTestDemo extends AbstractJavaSamplerClient {
    ApplicationContext ctx = null;
//    AuthService authService;-->service名称
//    CustomerLoginInfoService customerLoginInfoService;
//
//    RegisterRespDTO userInfo;-->注册账号的DTO

    String userOrPName="xxx";
    String defaultHead="1234567894505ea23-ce22-4ca3-b2f7-f3f3234.jpg";
    String merchantNo="520000000010100";
    String clientNo="120000000080100";

    public Arguments getDefaultParameters() {
        Arguments params = new Arguments();
        params.addArgument("label", "exec name");
        params.addArgument("label2", "exec name2");
        return params;
    }


    public void setupTest(JavaSamplerContext arg0) {
        ctx = SpringContext.loadClassPathXmlPath("application-dubbo-consumer.xml");
//        authService = ctx.getBean("AuthService", AuthService.class);
//        customerLoginInfoService = ctx.getBean("CustomerLoginInfoService", CustomerLoginInfoService.class);
//        userInfo = CustomerRegisterUtil.createUser(customerLoginInfoService,userOrPName,defaultHead,"");
    }


    public SampleResult runTest(JavaSamplerContext arg0) {
        SampleResult sr = new SampleResult();
        try {
            sr.setSampleLabel("test");
            //构建参数
            // 创建1个U，有头像
            //给这个U获取一个openid
//            GetAuthOpenIdReqDTO getAuthOpenIdReqDTO=new GetAuthOpenIdReqDTO();
//            getAuthOpenIdReqDTO.setRoleType("USER");
//            getAuthOpenIdReqDTO.setMerchantNo(merchantNo);
//            getAuthOpenIdReqDTO.setClientNo(clientNo);
//            getAuthOpenIdReqDTO.setOutOperatorId(userInfo.getOperatorNo());
//            getAuthOpenIdReqDTO.setTraceLogId("123");

            sr.sampleStart();// jmeter 开始统计响应时间标记
//            Result<GetAuthOpenIdRespDTO> respDTO= authService.getAuthOpenId(getAuthOpenIdReqDTO);//接口调用
            sr.sampleEnd();
            //下面校验结果
//            if (respDTO != null && !respDTO.getResult().getOpenId().equals("")) {
//                sr.setResponseData(JSONObject.toJSONString(respDTO), null);  //将结果输出到结果树当中
//                sr.setDataType(SampleResult.TEXT);    //请求头中会多个类型输出 Data type ("text"|"bin"|""): text
//            }
            //System.out.println(resultData);  //会输出到控制台，使用Jmeter 会输出到控制台或日志里面
            sr.setSuccessful(true);
        } catch (Throwable e) {
            sr.setSuccessful(false);
            sr.setResponseData("Check the input parameters is correct !",null);
            e.printStackTrace();
        } finally {
            ; //Jmeter 结束统计响应时间标记
        }
        return sr;
    }
}
