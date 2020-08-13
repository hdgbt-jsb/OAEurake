package com.js.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @program: OAEurake
 * @Date: 2020/8/13 17:19
 * @Author: jiangshuang
 * @Description:
 */
@Data
@ToString
public class PageResVo<T> {
    private Integer pageNum;

    private Integer pageSize;

    private List<T> listMess;

    private Integer count;
}
