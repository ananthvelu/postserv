package com.fress.post.service.impl;

import com.fress.post.service.api.Post;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface PostResource {
    @POST
    Post createPost(Post post);
}

