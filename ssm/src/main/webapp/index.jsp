<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/19 0019
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/testFindAll">测试</a>

    <form action="account/testInsert" method="post">
        用户名：<input type="text" name="userName"/><br/>
        密码：<input type="text" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
