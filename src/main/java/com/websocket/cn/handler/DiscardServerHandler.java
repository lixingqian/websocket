package com.websocket.cn.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @author : lixingqian
 * @Description : <br>
 * @date : Created in 2019-6-25 09:40 <br>
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
    /**
     * 这里我们覆盖了chanelRead()事件处理方法。 每当从客户端收到新的数据时， 这个方法会在收到消息时被调用，
     * 这个例子中，收到的消息的类型是ByteBuf
     *
     * @param ctx
     *            通道处理的上下文信息
     * @param msg
     *            接收的消息
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        /*
         * ByteBuf是一个引用计数对象，这个对象必须显示地调用release()方法来释放。
         * 请记住处理器的职责是释放所有传递到处理器的引用计数对象。
         */
        // 抛弃收到的数据
        // 以静默方式丢弃接收的数据

        ctx.writeAndFlush(msg);
        /*
            ByteBuf in = (ByteBuf) msg;
            try {
                while (in.isReadable()) {
                    System.out.print((char) in.readByte());
                    System.out.flush();
                }
            } finally {
                ReferenceCountUtil.release(msg);
            }
        */
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx ,Throwable cause){
        /**
         * exceptionCaught() 事件处理方法是当出现 Throwable 对象才会被调用，即当 Netty 由于 IO
         * 错误或者处理器在处理事件时抛出的异常时。在大部分情况下，捕获的异常应该被记录下来 并且把关联的 channel
         * 给关闭掉。然而这个方法的处理方式会在遇到不同异常的情况下有不 同的实现，比如你可能想在关闭连接之前发送一个错误码的响应消息。
         */
        //出现异常时关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
