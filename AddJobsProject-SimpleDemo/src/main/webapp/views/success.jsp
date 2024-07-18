<%@page language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>
        <h2>entered data</h2>
        <h3>jobId:${jobposted.jobId}</h3>
        <h3>jobTitle:${jobposted.jobTitle}</h3>
        <h3>techstack needed</h3>
        <ul>
            <c:forEach var="job" items="${jobposted.jobTechStack}">
                <li>${job}</li>
            </c:forEach>
        </ul>


    </body>
</html>