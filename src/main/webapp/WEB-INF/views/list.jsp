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
                    <c:set var="num" value="${num+1}"></c:set>
                    <tr class="text-center">
                        <td>
                            <span>${num}</span>
                        </td>
                        <td>
                            <a href="#">
                                <span><c:out value="${board.title}"/></span>
                            </a>
                        </td>
                        <td>
                            <span>${board.name}</span>
                        </td>
                        <td>
                            <span>${board.createdDate}</span>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <nav aria-label="Page navigation example d-flex">
                <ul class="pagination d-flex"  style="justify-content: center">
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>
                </ul>
            </nav>
            <div>
            </div>
            <button type="button" class="btn btn-primary" onclick="location.href='post'">글쓰기</button>
        </div>
    </div>
</div>
