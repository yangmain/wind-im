package com.windchat.common.utils;

import com.google.gson.Gson;

/**
 * @author
 */
public class GsonUtils {
    public static String toJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String str, Class<T> clazz) {
        return new Gson().fromJson(str, clazz);
    }
}
