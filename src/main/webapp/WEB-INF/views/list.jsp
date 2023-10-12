<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container" style="margin-top:30px">
    <div class="row">
        <div class="col-sm-12">
            <%= java.time.LocalDateTime.now() %>
            <table class="table">
                <thead class="thead-light">
                <tr class="text-center">
                    <th scope="col">#</th>
                    <th scope="col">제목</th>
                    <th scope="col">작성자</th>
                    <th scope="col">작성일</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="board" items="${boardList}" varStatus="status">
                    <tr class="text-center">
                        <td>
                            <span> <c:out value="${board.num}"/></span>
                        </td>
                        <td>
                            <a>
                                <span><c:out value="${board.title}"/></span> <!-- 제목을 표시하려면 board.title 사용 -->
                            </a>
                        </td>
                        <td>
                            <span>${board.name}</span>
                        </td>
                        <td>
                            <span>${board.createdDate}</span> <!-- 작성일을 표시하려면 board.createdDate 사용 -->
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div>
            </div>
            <button type="button" class="btn btn-primary">글쓰기</button>
        </div>
    </div>
</div>
