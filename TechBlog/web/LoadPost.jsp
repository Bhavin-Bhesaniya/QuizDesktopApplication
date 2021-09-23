<%@page import="java.util.List"%>
<%@page import="techBlogEntity.Post"%>
<%@page import="techBlogHelper.ConnectionProvider"%>
<%@page import="techBlogDatabase.PostDao"%>

<div class="row">

    <%
        Thread.sleep(1000);
        PostDao d = new PostDao(ConnectionProvider.getConnection());

        int cid = Integer.parseInt(request.getParameter("cid"));
        List<Post> posts = null;
        if (cid == 0) {
            posts = d.getAllPosts();
        } else {
            posts = d.getPostsById(cid);
        }

        if(posts.size() == 0)
        {
            out.print("No post in this category");
            return;
        }
        
        
        for (Post p : posts) {
    %>

    <div class="col-md-6 mt-2">

        <div class="card">
            <img class="card-img-top" src="blogpic/<%= p.getppic()%>" style="height : 100px; width:100px; margin: 10px; " alt="Photo not found" onerror >
            <div class="card-body">
                <h5><%= p.getptitle()%></h5>
                <p><%= p.getpcontent()%></p>
            </div>
            <div class="card-footer">
                <a href="showBlogPost.jsp?postid=<%= p.getpid() %>" class="btn-outline-primary btn-sm">Read More</a>
                <a href="!#" class="btn-outline-primary btn-sm"><i class="fa fa-thumbs-o-up"></i><span>10</span></a>
                <a href="!#" class="btn-outline-primary btn-sm"><i class="fa fa-commenting-o"></i><span>10</span></a>
            </div>
        </div>

    </div>

    <%
        }

    %>
</div>