<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<jsp:useBean id="board" class="com.board.api.board.Board" scope="session" />

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <title>Spring Boot Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
</head>
<style>
    *{margin: 0; padding: 0; box-sizing: border-box;}
    a{color: inherit;text-decoration: none}
    a:link,a:visited{text-decoration: none;color: #333}
</style>
<body>
    <div class="navbar navbar-dark bg-dark shadow-sm mb-3">
        <div class="container d-flex justify-content-between">
            <a href="/" class="navbar-brand d-flex align-items-center">
                <strong>게시판</strong>
            </a>
        </div>
    </div>

