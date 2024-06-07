<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Assignment</title>
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <h1>Employee Assignment</h1>
    <a href="employeeList.jsp" class="btn btn-secondary">Employee List</a>
    <a href="home.jsp" class="btn btn-secondary">Back to Home</a>
    <form action="assignProject" method="post">
        <div class="form-group">
            <label for="employeeName">Employee Name</label>
            <select id="employeeName" name="employeeId" class="form-control">
                <c:forEach var="employee" items="${employees}">
                    <option value="${employee.id}">${employee.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="projectName">Project Name</label>
            <select id="projectName" name="projectId" class="form-control">
                <c:forEach var="project" items="${projects}">
                    <option value="${project.id}">${project.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="implication">Implication</label>
            <input type="number" id="implication" name="implication" class="form-control" min="0" max="100" value="20"/>
        </div>
        <button type="submit" class="btn btn-primary">Assign Project</button>
    </form>
</div>
</body>
</html>
