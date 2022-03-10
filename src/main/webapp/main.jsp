<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_Interceptor
  File name(文件名): main
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/10
  Time(创建时间)： 18:29
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎 ${user.name}，登录！<br/>
<a href="${pageContext.request.contextPath }/logout">退出</a>
</body>
</html>
