<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Chọn màu nền</title>
    <style>
        body {
            background-color: ${sessionScope.color};
            color: black;
        }
    </style>
</head>
<body>
    <h2>Chọn màu nền:</h2>
    
    <form action="color" method="post">
        <select name="color">
            <option value="white">Trắng</option>
            <option value="red">Đỏ</option>
            <option value="blue">Xanh dương</option>
            <option value="green">Xanh lá</option>
            <option value="yellow">Vàng</option>
        </select>
        <input type="submit" value="Đổi màu" />
    </form>

    <c:if test="${not empty sessionScope.color}">
        <p>Màu nền hiện tại: <strong>${sessionScope.color}</strong></p>
    </c:if>

    <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>
</body>
</html>
