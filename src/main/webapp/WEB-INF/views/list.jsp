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
                            <span>${status.count}</span>
                        </td>
                        <td>
                            <a href="<c:url value='/view?num=${board.num}' />">
                                <strong><c:out value="${board.title}" /></strong>
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
            <div>
                <c:if test="${pagination.curPage != 1}">
                    <a href="#" onClick="fn_paging(1)">[처음]</a>
                </c:if>
                <c:if test="${pagination.prevPage > 0}">
                    <a href="#" onClick="fn_paging(${pagination.prevPage})">[이전]</a>
                </c:if>
                <c:forEach var="pageNum" begin="${pagination.startPage}" end="${pagination.endPage}">
                    <c:choose>
                        <c:when test="${pageNum eq pagination.curPage}">
                            <span style="font-weight: bold;"><a href="#" onClick="fn_paging(${pageNum})">${pageNum}</a></span>
                        </c:when>
                        <c:otherwise>
                            <a href="#" onClick="fn_paging(${pageNum})">${pageNum}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                <c:if test="${pagination.nextPage <= pagination.pageCnt}">
                    <a href="#" onClick="fn_paging(${pagination.nextPage})">[다음]</a>
                </c:if>
                <c:if test="${pagination.endPage < pagination.pageCnt}">
                    <a href="#" onClick="fn_paging(${pagination.pageCnt})">[끝]</a>
                </c:if>
            </div>

            <div>
            </div>


            <button type="button" class="btn btn-primary" onclick="location.href='post'">글쓰기</button>
        </div>
    </div>
</div>
<script>
    function fn_paging(page) {
        var url = '/?page=' + page;

        window.location.href = url;
    }
</script>
