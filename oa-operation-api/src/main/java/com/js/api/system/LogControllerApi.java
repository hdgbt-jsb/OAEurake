package com.js.api.system;

import com.js.form.BasePageForm;
import com.js.form.SysLogForm;
import com.js.response.BaseResponse;
import com.js.vo.PageResVo;
import com.js.vo.system.SysLogVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 姜爽
 * @Description: 系统日志Controller
 * @Date: 2020/5/4 9:51
 */

@RequestMapping("/system/log")
@Api("系统日志Controller")
public interface LogControllerApi {

    @PostMapping("getLog")
    @ApiOperation(value = "分页获取系统日志", notes = "分页获取系统日志")
    BaseResponse<PageResVo<SysLogVo>> getLogMess(@RequestBody BasePageForm basePageForm);

    @GetMapping("exportLog")
    @ApiOperation(value = "导出系统日志", notes = "导出系统日志")
    void exportLog(HttpServletResponse response);

    @GetMapping("addLog")
    @ApiOperation(value = "添加系统日志", notes = "添加系统日志")
    void addLog(@RequestBody SysLogForm sysLogForm);
}
