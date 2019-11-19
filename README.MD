步骤：

1.发起请求到前端控制器(DispatcherServlet)
2.前端控制器请求处理器映射器(HandlerMapping)查找Handler(可根据xml配置、注解进行查找)
3.处理器映射器(HandlerMapping)向前端控制器返回Handler
4.前端控制器调用处理器适配器(HandlerAdapter)执行Handler
5.处理器适配器(HandlerAdapter)去执行Handler
6.Handler执行完，给适配器返回ModelAndView(Springmvc框架的一个底层对象)
7.处理器适配器(HandlerAdapter)向前端控制器返回ModelAndView
8.前端控制器(DispatcherServlet)请求视图解析器(ViewResolver)进行视图解析，根据逻辑视图名解析成真正的视图(jsp)
9.视图解析器(ViewResolver)向前端控制器(DispatcherServlet)返回View
10.前端控制器进行视图渲染，即将模型数据(在ModelAndView对象中)填充到request域
11.前端控制器向用户响应结果

原理图解释
