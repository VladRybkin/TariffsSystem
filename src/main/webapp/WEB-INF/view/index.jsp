<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<h1>Tariff application</h1><br/>

<h2>All tariffs</h2><br/>

<%--<c:forEach var="tariff" items="${requestScope.tarrifs}">--%>
<%--<ul>--%>
<%--<li>tariffType: <c:out value="${tariff.tarifftype}"/></li>--%>
<%--<li>monthFee: <c:out value="${tariff.monthfee}"/></li>--%>
<%--<li>costMinute: <c:out value="${tariff.costminute}"/></li>--%>
<%--<li>costSMS: <c:out value="${tariff.costsms}"/></li>--%>
<%--<li>availableMinutes: <c:out value="${tariff.availableminutes}"/></li>--%>
<%--<li>availableSMS: <c:out value="${tariff.availablesms}"/></li>--%>
<%--</ul>--%>
<%--<hr/>--%>
<%----%>


<%--</c:forEach>--%>
<c:forEach items="${tariffs}" var="tariff">
    <c:out value="${tariff}"/><br/>
</c:forEach>

<hr/>
<h3>Search by month fee</h3><br/>

<form method="post" action="">

    <label><input type="number" name="monthFeeFrom"></label>monthFeeFrom<br>
    <label><input type="number" name="monthFeeTo"></label>monthFeeTo<br>
    <input type="submit" value="Ok" name="Ok"><br>

    <c:forEach items="${foundTariffs}" var="found">
        <c:out value="${found}"/><br/>
    </c:forEach>
    <hr/>


    <%--<label><input type="text" name="tariffType"></label>name<br>--%>
    <%--<label><input type="text" name="clientName"></label>name<br>--%>
    <%--<label><input type="text" name="clientNumber"></label>number<br>--%>

    <%--<input type="submit" value="Ok" name="Ok"><br>--%>
    <c:forEach items="${clients}" var="found">
        <c:out value="${found}"/><br/>
    </c:forEach>
    <c:out value="${requestScope.amountOfClients}"/>




</form>




</body>
</html>
