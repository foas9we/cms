package com.briup.apps.util;

import java.util.Date;

public class MessageUtil {

    /**
     * 返回失败消息，一般用于增删改查操作消息返回
     * @param msg
     * @return
     */
    public static Message error(String msg){
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * 返回成功消息，一般用于增删改查操作消息返回
     * @param msg
     * @return
     */
    public static Message success(String msg){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * 返回成功消息，用于查询操作消息的返回
     * @param msg
     * @param data
     * @return
     */
    public static Message success(String msg,Object data){
        Message message = new Message();
        message.setStatus(200);
        message.setData(data);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * 返回成功消息，一般用于查询消消息结果的返回
     * @param data
     * @return
     */
    public static Message success(Object data){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage("success");
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }
}
