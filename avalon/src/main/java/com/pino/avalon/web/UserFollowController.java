package com.pino.avalon.web;
import com.pino.avalon.core.Result;
import com.pino.avalon.core.ResultGenerator;
import com.pino.avalon.model.UserFollow;
import com.pino.avalon.service.UserFollowService;
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
@RequestMapping("/user/follow")
public class UserFollowController {
    @Resource
    private UserFollowService userFollowService;

    @PostMapping("/add")
    public Result add(UserFollow userFollow) {
        userFollowService.save(userFollow);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userFollowService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserFollow userFollow) {
        userFollowService.update(userFollow);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        UserFollow userFollow = userFollowService.findById(id);
        return ResultGenerator.genSuccessResult(userFollow);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserFollow> list = userFollowService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
