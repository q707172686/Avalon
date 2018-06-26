package com.pino.avalon.web;
import com.pino.avalon.core.Result;
import com.pino.avalon.core.ResultGenerator;
import com.pino.avalon.model.Post;
import com.pino.avalon.service.PostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Pino on 2018/06/26.
*/
@RestController
@RequestMapping("/post")
public class PostController {
    @Resource
    private PostService postService;

    @PostMapping("/add")
    public Result add(Post post) {
        postService.save(post);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        postService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Post post) {
        postService.update(post);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Post post = postService.findById(id);
        return ResultGenerator.genSuccessResult(post);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Post> list = postService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
