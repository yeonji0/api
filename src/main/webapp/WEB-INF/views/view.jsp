<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8" />
    <title>게시글 수정</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <div class="form-group row">
        <label for="inputTitle" class="col-sm-2 col-form-label"><strong>제목</strong></label>
        <div class="col-sm-10">
            <input type="text" name="title" class="form-control" id="inputTitle" value="${board.title}" />
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label"><strong>이름</strong></label>
        <div class="col-sm-10">
            <p>${board.name}</p>
        </div>
    </div>
    <div class="form-group row">
        <label for="inputContent" class="col-sm-2 col-form-label"><strong>내용</strong></label>
        <div class="col-sm-10">
            <textarea type="text" name="content" class="form-control" id="inputContent">${board.content}</textarea>
        </div>
    </div>
    <div class="row">
        <div class="col-auto mr-auto"></div>
        <div class="col-auto">
            <input class="btn btn-danger" type="submit" role="button" onClick="location.href='#'" value="삭제" />
            <input class="btn btn-success" type="submit" role="button" onClick="location.href='#'" value="수정" />
            <input class="btn btn-primary" type="submit" role="button" onClick="location.href='/'" value="리스트" />
        </div>
    </div>
</div>
</body>
