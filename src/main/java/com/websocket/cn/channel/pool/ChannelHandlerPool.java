package com.websocket.cn.channel.pool;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * ChannelHandlerPool
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @author : lixingqian
 * @Description :  通道组池，管理所有websocket连接<br>
 * @date : Created in 2019-6-24 15:37 <br>
 */
public class ChannelHandlerPool {

    public ChannelHandlerPool(){}
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
