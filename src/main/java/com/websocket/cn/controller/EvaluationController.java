package com.websocket.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @author : lixingqian
 * @Description : <br>
 * @date : Created in 2019-6-24 16:03 <br>
 */
@Controller
public class EvaluationController {
    @RequestMapping(value="/index")
    public String indexPage(){
        return "view/socket-h5.html";
    }
}
