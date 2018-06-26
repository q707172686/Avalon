package com.pino.avalon.service.impl;

import com.pino.avalon.dao.CommentMapper;
import com.pino.avalon.model.Comment;
import com.pino.avalon.service.CommentService;
import com.pino.avalon.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Pino on 2018/06/26.
 */
@Service
@Transactional
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {
    @Resource
    private CommentMapper mapper;

}
