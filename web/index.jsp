<%--
  Created by IntelliJ IDEA.
  User: osmanidris
  Date: 1/11/17
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Investing Consultancy</title>
  </head>
  <body>
  <h2>Welcome to our Investing Consultancy:</h2>
  <h4>Please fill the below data:</h4>
  <form action="/invest" method="post">
    <table>
      <tr>
        <td>Investor Name:</td>
        <td><input  typ="text" name="iName" value="Osman"/></td>
      </tr>
      <tr>
        <td>Money to invest:</td>
        <td><input type="text" name="iAmount" value="500"></td>
      </tr>
      <tr>
        <td>Exepected Profit:</td>
        <td><input type="text" name="iProfit" value="50"></td>
      </tr>
      <tr>
        <td>Number of weeks:</td>
        <td><input type="text" name="noOfWeeks" value="12"></td>
      </tr>
    </table>
    <p><input type="submit" value="Submit"></p>
  </form>

  </body>
</html>
