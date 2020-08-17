package com.fress.post.service.impl;

import com.fress.post.service.api.Post;
import com.fress.post.domain.datamodel.PostDO;
import com.fress.post.domain.operations.PostOperationImpl;
import com.fress.post.service.mapper.ServiceMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Slf4j
@Scope(scopeName = "request")
public class PostResourceImpl implements PostResource {
    @Inject
    private PostOperationImpl postOperation;

    @Inject
    private ServiceMapper mapper;

    @Override
    public Post createPost(Post post) {
        PostDO requestDO = mapper.mapToPostDO(post);
        PostDO postDO = postOperation.createPost(requestDO);
        Post responsePost = mapper.mapFromPostDO(postDO);
        return responsePost;
    }
}
