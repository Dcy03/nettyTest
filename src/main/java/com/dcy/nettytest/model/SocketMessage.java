package com.dcy.nettytest.model;

import lombok.Data;

/**
 * @author Dcy
 */
@Data
public class SocketMessage {

    /**
     * 消息类型
     */
    private String messageType;

    /**
     * 消息发送者id
     */
    private Integer userId;

    /**
     * 接收者id或群聊id
     */
    private Integer chatId;

    /**
     * 消息内容
     */
    private String message;

}
