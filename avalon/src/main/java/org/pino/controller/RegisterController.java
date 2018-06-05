package org.pino.controller;

import org.pino.dao.UserMapper;
import org.pino.dto.BaseResult;
import org.pino.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Pino
 * @Description: 注册的Controller
 * @Date: 下午8:46 18-6-4
 * @Modified:
 */
@Controller
@RequestMapping("/reg")
public class RegisterController {

    @Autowired
    private RegService regService;

    @RequestMapping(value = "/checkUsername.do", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult<String> checkUsername(@RequestParam("username") String username) {
        BaseResult<String> result = regService.checkUsername(username);
        return result;
    }

}
