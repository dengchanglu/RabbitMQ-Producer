package com.xyebank.hzx.rabbitmq.utils;

import com.alibaba.fastjson.JSON;

public class JsonUtils {
	public static String objectToJson(Object obj) {
		return JSON.toJSONString(obj);
	}

	@SuppressWarnings("unchecked")
	public static <T> T JsonToObject(String json, T t) {
		return (T) JSON.parseObject(json, t.getClass());
	}
}
