package com.js.util;

import java.util.UUID;

/**
 * 分布式id生成器
 */
public class IdUtils {

    public static synchronized String get32UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

