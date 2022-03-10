<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_Interceptor
  File name(文件名): login
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/10
  Time(创建时间)： 18:28
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="name"/><br>
    密码：<input type="password" name="password"/><br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
