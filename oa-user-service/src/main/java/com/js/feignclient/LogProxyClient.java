package com.js.feignclient;

import com.js.api.system.LogControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: OAEurake
 * @Date: 2020/8/13 17:42
 * @Author: jiangshuang
 * @Description:
 */
@FeignClient(value = "oa-operation-service")
public interface LogProxyClient extends LogControllerApi {

}
