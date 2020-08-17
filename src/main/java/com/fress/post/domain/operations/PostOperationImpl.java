package com.fress.post.domain.operations;

import com.fress.post.domain.datamodel.PostDO;
import org.springframework.context.annotation.Scope;

import javax.inject.Named;

@Named
@Scope(scopeName = "request")
public class PostOperationImpl {
    public PostDO createPost(PostDO postDO) {
        PostDO a = new PostDO();
        a.setId("23567");
        return a;
    }
}
