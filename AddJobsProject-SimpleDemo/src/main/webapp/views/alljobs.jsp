<%@page language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>
        <h2>all posted jobs are:</h2>
        <ul>
        <c:forEach var="job" items="${alljobList}">
                <li><h3>jobId:${job.jobId}</h3></li>
                <li>jobTitle:${job.jobTitle}</li>
                <li>techstack needed</li>
                <ul>
                 <c:forEach var="techstack" items="${job.jobTechStack}">
                    <li>${techstack}</li>
                 </c:forEach>
                </ul>

        </c:forEach>
       </ul>

    </body>
</html>