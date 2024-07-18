<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <body>
       <form action="success" method="post">
            <label for="jobId">Job ID</label>
            <input type="text" id="jobId" name="jobId"/><br/>
            <label for="jobTitle">Job Title</label>
            <input type="text" id="jobTitle" name="jobTitle"/><br/>
            <label for="jobTechStack">Tech Stack</label>
            <select multiple id="jobTechStack" name="jobTechStack">
                <option value="java">Java</option>
                <option value="springboot">Spring Boot</option>
                <option value="js">JavaScript</option>
            </select><br/>
            <input type="submit" value="Submit">
       </form>
    </body>
</html>
