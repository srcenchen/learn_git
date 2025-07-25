package com.example.hellospringboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MessageController {
    @GetMapping
    fun listMessages() : HashMap<String, String> {
        listOf(
            Message("1", "123"),
            Message("2", "222"),
            Message("3", "333")
        )


        // 就当我开发了个新功能吧


        // 我要合并咯
        var a = HashMap<String, String>();
        a.put("a", "a");
        a["a"];
        return a;
    }


}