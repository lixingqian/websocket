package com.websocket.cn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @author : lixingqian
 * @Description : 开启websocket支持
 * @date : Created in 2019-6-24 14:59 <br>
 */
@Configuration
public class WebSocketConfig {
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
}
