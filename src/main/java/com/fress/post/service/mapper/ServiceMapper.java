package com.fress.post.service.mapper;

import com.fress.post.service.api.Post;
import com.fress.post.domain.datamodel.PostDO;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceMapper {

    PostDO mapToPostDO(Post post);

    Post mapFromPostDO(PostDO postDO);
}
