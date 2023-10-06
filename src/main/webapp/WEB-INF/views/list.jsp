
<jsp:useBean id="board" class="com.board.api.board.Board" scope="session" />
<%--<jsp:useBean id="m" scope="session" class="com.board.api.board.Board" />--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
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
                <tr class="text-center">
                    <th scope="row">
                        <span><jsp:getProperty name="board" property="name" /></span>
                    </th>
                    <td>
                        <a>
                            <span>${name}</span>
                        </a>
                    </td>
                    <td>
<%--                        <span><%= request.getParameter("name") %></span>--%>
                    </td>
                    <td>
<%--                        <span><%= board.getName() %></span>--%>
                    </td>
                </tr>
                </tbody>
            </table>
            <%--            <button type="button" class="btn btn-primary">글쓰기</button>--%>
        </div>
    </div>
</div>