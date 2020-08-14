package com.js.controller.system;

import com.js.api.system.LogControllerApi;
import com.js.dto.system.SysLogDto;
import com.js.enums.StatusCode;
import com.js.exception.SystemException;
import com.js.form.BasePageForm;
import com.js.form.SysLogForm;
import com.js.response.BaseResponse;
import com.js.service.system.SysLogService;
import com.js.util.excel.ExcelUtil;
import com.js.vo.PageResVo;
import com.js.vo.system.SysLogVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: 姜爽
 * @Description: 系统日志Controller
 * @Date: 2020/5/4 9:51
 */
@Slf4j
@RestController
public class LogController implements LogControllerApi {

    @Autowired
    private SysLogService sysLogService;

    @Override
    public BaseResponse<PageResVo<SysLogVo>> getLogMess(@RequestBody BasePageForm basePageForm) {
        PageResVo<SysLogVo> sysLogVoPageResVo = null;
        try {
            sysLogVoPageResVo = sysLogService.showAllLog(basePageForm.getOffset(), basePageForm.getLimit());

        } catch (Exception e) {
            log.info("查询出现的异常为{}", e);
            throw new SystemException("日志查询失败");
        }
        return new BaseResponse<>(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMsg(),sysLogVoPageResVo);
    }

    @Override
    public void exportLog(HttpServletResponse response) {
        try {
            List<SysLogVo> sysLogVoList = sysLogService.exportSysLog();
            String[] header = {"日志id","操作者","用户操作","请求时长","操作相关类","请求参数","访问者的IP","操作时间"};
            String fileName = "SysLog.xls";
            ExcelUtil.export(response,sysLogVoList,header,fileName);
        } catch (Exception e) {
            log.info("查询出现的异常为{}", e);
            throw new SystemException("日志导出失败");
        }
    }

    @Override
    public void addLog(@RequestBody SysLogForm sysLogForm){
        try{
            SysLogDto sysLogDto = new SysLogDto();
            BeanUtils.copyProperties(sysLogForm,sysLogDto);
            sysLogService.addSysLog(sysLogDto);
        }catch (Exception e){
            log.info("添加日志出现的异常为{}", e);
        }
    }
}
