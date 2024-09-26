<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  .container {
    text-align: center;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    max-width: 600px;
    margin: auto;
  }

  h2 {
    color: #333;
  }

  h1 a {
    display: inline-block;
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    text-decoration: none;
    border-radius: 3px;
    font-size: 18px;
    transition: background-color 0.3s ease;
  }

  h1 a:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>
  <div class="container">
    <h2>Employee Details</h2>
    <h1><a href="getAllEmployees">Click Here</a></h1>
  </div>
</body>
</html>
