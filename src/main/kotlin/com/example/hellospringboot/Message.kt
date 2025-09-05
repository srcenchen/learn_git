package com.example.hellospringboot

data class Message(val id: String?, val text: String)

// 我在这里创建了一个新data 之后推上去
data class Message2(val id: String?, val text: String)

// 再次模拟提交代码 冲突一

// z这是冲突二 不保留这个冲突