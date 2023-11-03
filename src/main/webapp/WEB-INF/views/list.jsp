<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container" style="margin-top:30px">
    <div class="row">
        <div class="col-sm-12">
            <p><strong>${count}</strong> 개의 게시글이 있습니다.</p>
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
                            <span>${board.num}</span>
                        </td>
                        <td>
                            <a href="<c:url value='/view?num=${board.num}' />">
                                <strong><c:out value="${board.title}"/></strong>
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
            <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                    <li class="page-item">
                        <c:if test="${pagination.curPage != 1}">
                            <a class="page-link" href="#" onclick="fn_paging(1)">
                                <span>&laquo;</span>
                            </a>
                        </c:if>
                    </li>
                    <li class="page-item">
                        <c:if test="${pagination.curPage != 1}">
                            <a class="page-link" href="#" onclick="fn_paging(${pagination.prevPage})">
                                <span>&lt;</span>
                            </a>
                        </c:if>
                    </li>
                    <c:forEach var="pageNum" begin="${pagination.startPage}" end="${pagination.endPage}">
                        <li class="page-item">
                            <c:choose>
                                <c:when test="${pageNum == pagination.curPage}">
                                    <span class="page-link active">${pageNum}</span>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-link" href="#" onClick="fn_paging(${pageNum})">${pageNum}</a>
                                </c:otherwise>
                            </c:choose>
                        </li>
                    </c:forEach>
                    <li class="page-item">
                        <a class="page-link" href="#" onClick="fn_paging(${pagination.nextPage})">
                            <span aria-hidden="true">&gt;</span>
                        </a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#" onClick="fn_paging(${pagination.pageCnt})">
                            <span aria-hidden="true">&raquo;</span>
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
<script>
    function fn_paging(page) {
        url = '/?page=' + page;
        window.location.href = url;
    }
</script>
