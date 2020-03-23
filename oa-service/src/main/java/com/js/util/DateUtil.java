package com.js.util;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author: 姜爽
 * @date: 2019/12/12 14:37
 * @description: 日期封装类
 * @version: V1.0
 */
public class DateUtil {
    private DateUtil(){
        throw new IllegalStateException("DateUtil工具异常");
    }
    /**
     * 将日期转化为字符串(年/月/日) 8 位
     */
    public static Date getDate(Date dateTemp){
        if (dateTemp == null) {
            dateTemp = new Date();
        }
        return dateTemp;
    }
    public static String dateToString(Date dateTemp) {
        Date date = DateUtil.getDate(dateTemp);
        String dataString = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        dataString = formatter.format(date);
        return dataString;
    }
    /**
     * 将日期转化为字符串(年,月,日,时,分,秒)
     */
    public static String dateToStringMin(Date dateTemp) {
        Date date = DateUtil.getDate(dateTemp);
        String dataString = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dataString = formatter.format(date);
        return dataString;
    }
    /**
     * 将一个字符串转化为Date(年,月,日,时,分,秒)
     */
    public static Date strToDateLong(String strDate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }
    /**
     * 将日期转为8位字符串(年,月,日)
     */
    public static String dateToStr(Date dateTemp) {
        Date date = DateUtil.getDate(dateTemp);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        return formatter.format(date);
    }
    /**
     * 将日期转为8位字符串(年,月,日)結是8位字符串 例如（20151211）
     */
    public static String dateToStrCanInteger(Date dateTemp) {
        Date date = DateUtil.getDate(dateTemp);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(date);
    }
}

