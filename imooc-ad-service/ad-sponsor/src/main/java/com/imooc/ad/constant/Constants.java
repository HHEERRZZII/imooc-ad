package com.imooc.ad.constant;

public class Constants {
    //内部类
    public  class ErrorMsg {
        //说白了就是点点点，因为外部类可以调用内部类的属性，从而可以实现一些说明功能。记住要加static
        //先实例化再初始化，static可以跳过实例化，直接初始化使用，所以可以减少内存的使用。
        public static final String REQUEST_PARAM_ERROR = "请求参数错误";
        public static final String SAME_NAME_ERROR = "存在同名用户";
    }
}
