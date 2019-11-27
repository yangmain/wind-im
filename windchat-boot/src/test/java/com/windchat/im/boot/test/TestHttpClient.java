package com.windchat.im.boot.test;

import java.util.HashMap;
import java.util.Map;

import com.windchat.common.http.ZalyHttpClient;
import com.windchat.common.utils.GsonUtils;

public class TestHttpClient {
	public static void main(String args[]) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("test", "aaaaa");
		byte[] body = ZalyHttpClient.getInstance().postString("http://localhost:8080/hai/user/queryList", GsonUtils.toJson(map));
		System.out.println("body=" + new String(body));
	}
}