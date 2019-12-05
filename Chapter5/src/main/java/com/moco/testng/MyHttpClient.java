package com.moco.testng;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {

    @Test
    public void testHttpClient() throws IOException {
//        定义httpClient对象
        HttpClient httpClient = new DefaultHttpClient();
//        HttpGet类，参数为要执行的url，实际测试中可以为接口地址
        HttpGet httpGet = new HttpGet("http://localhost:8888/redirectedpath");
//        用httpClient对象执行httpGet，并把返回结果存到httpResponse中
        HttpResponse httpResponse = httpClient.execute(httpGet);
//        httpResponse的结果要调用getEntity方法接收，同时需要转换成String显示
        String result = EntityUtils.toString(httpResponse.getEntity());

        System.out.println(result);


    }
}
