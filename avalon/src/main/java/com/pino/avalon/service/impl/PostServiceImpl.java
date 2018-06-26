package com.pino.avalon.service.impl;

import com.pino.avalon.dao.PostMapper;
import com.pino.avalon.model.Post;
import com.pino.avalon.service.PostService;
import com.pino.avalon.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Pino on 2018/06/26.
 */
@Service
@Transactional
public class PostServiceImpl extends AbstractService<Post> implements PostService {
    @Resource
    private PostMapper postMapper;

}
