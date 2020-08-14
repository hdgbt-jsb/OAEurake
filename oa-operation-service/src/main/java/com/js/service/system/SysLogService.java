package com.js.service.system;

import com.github.pagehelper.PageHelper;
import com.js.dto.system.SysLogDto;
import com.js.mapper.system.SysLogMapper;
import com.js.pojo.system.SysLog;
import com.js.vo.PageResVo;
import com.js.vo.system.SysLogVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 姜爽
 * @Description: 系统日志相关Servcie
 * @Date: 2020/5/4 9:31
 */
@Service
@Slf4j
public class SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    /**
     * 添加系统日志
     **/
    public void addSysLog(SysLogDto sysLogDto) {
        SysLog sysLog = new SysLog();
        BeanUtils.copyProperties(sysLogDto, sysLog);
        int result = sysLogMapper.addSysLog(sysLog);
        log.info("系统执行日志添加功能结果{}", result);
    }

    /**
     * 查询系统日志
     **/
    public PageResVo<SysLogVo> showAllLog(Integer offset, Integer limit) {
        log.info("查询入参为{},{}", offset, limit);
        PageResVo<SysLogVo> pageResVo = new PageResVo<>();
        PageHelper.startPage(offset, limit);
        List<SysLog> sysLogs = sysLogMapper.showAllLog();
        pageResVo.setCount(sysLogMapper.count());
        pageResVo.setPageNum(offset);
        pageResVo.setPageSize(limit);
        log.info("查询结果为{}", sysLogs);
        if (sysLogs == null) {
            return null;
        }
        List<SysLogVo> sysLogVoList = new ArrayList<>();
        sysLogs.forEach(sysLog -> {
            SysLogVo sysLogVo = new SysLogVo();
            BeanUtils.copyProperties(sysLog, sysLogVo);
            sysLogVoList.add(sysLogVo);
        });
        pageResVo.setListMess(sysLogVoList);

        return pageResVo;
    }

    /**
     * 查询系统日志
     **/
    public List<SysLogVo> exportSysLog() {
        List<SysLog> sysLogs = sysLogMapper.showAllLog();
        log.info("查询结果为{}", sysLogs);
        List<SysLogVo> sysLogVoList = new ArrayList<>();
        sysLogs.forEach(sysLog -> {
            SysLogVo sysLogVo = new SysLogVo();
            BeanUtils.copyProperties(sysLog, sysLogVo);
            sysLogVoList.add(sysLogVo);
        });
        return sysLogVoList;
    }

    /**
     * 清理所有日志
     */
    public void truncateLog() {
        sysLogMapper.truncateLog();
    }
}
