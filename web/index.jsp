<%--
  Created by IntelliJ IDEA.
  User: Isanka
  Date: 8/2/2020
  Time: 12:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>My Calculator</title>
  </head>
  <body>
  <div align="center">
    <h1>Web Application</h1>
    <form action="cal" method="post">
      <p>
        Sentence <input type="text" name="sen" required />
      </p>
      <p>
        Petitioner Members <input type="text" name="pet" required />
      </p>
      <p>
        Defendant  Members <input type="text" name="def" required />
      </p>
      <p>
        <input type="submit" value="RUN" />
      </p>
    </form>
  </div>
  </body>
</html>

<!DOCTYPE html>
<html lang="en">

