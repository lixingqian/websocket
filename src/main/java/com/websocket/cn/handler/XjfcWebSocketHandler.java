package com.websocket.cn.handler;

import com.websocket.cn.channel.pool.ChannelHandlerPool;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

/**
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @author : lixingqian
 * @Description : <br>
 * @date : Created in 2019-6-24 15:47 <br>
 */
public class XjfcWebSocketHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private static Integer countNumber = 1;
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("与客户端建立连接，通道开启！");
        System.out.println(XjfcWebSocketHandler.countNumber++);

        //添加到channelGroup通道组
        ChannelHandlerPool.channelGroup.add(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("与客户端断开连接，通道关闭！");
        //添加到channelGroup 通道组
        ChannelHandlerPool.channelGroup.remove(ctx.channel());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        System.out.println("客户端收到服务器数据：" + msg.text());
        int n = 10;
        for (int i = 0; i <n ; i++) {

            sendAllMessage(msg.text());
            Thread.sleep(1000);
        }
    }

    private void sendAllMessage(String message){
        //收到信息后，群发给所有channel
        ChannelHandlerPool.channelGroup.writeAndFlush( new TextWebSocketFrame(message));
    }
}
