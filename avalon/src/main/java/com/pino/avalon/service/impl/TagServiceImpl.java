package com.pino.avalon.service.impl;

import com.pino.avalon.dao.TagMapper;
import com.pino.avalon.model.Tag;
import com.pino.avalon.service.TagService;
import com.pino.avalon.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Pino on 2018/06/26.
 */
@Service
@Transactional
public class TagServiceImpl extends AbstractService<Tag> implements TagService {
    @Resource
    private TagMapper tagMapper;

}
