package cn.mzjmc.project.controller;

import cn.mzjmc.project.entity.User;
import cn.mzjmc.project.response.ResponseUtil;
import cn.mzjmc.project.service.UserService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * @Valid  开启校验 对应实体中的校验
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result)
    {
        if (result.hasErrors()){
            return result.getFieldError().getDefaultMessage();
        }
        System.out.println(user.getName());
        System.out.println(user.getAge());
        userService.addUser(user);
        return "ok!";
    }

    @GetMapping("/findAllUser")
    public Object findAllUser()
    {
        List<Object> list = userService.finAllUser();
        for (int i = 0; i < list.size(); i++) {
            User user = (User) list.get(i);
            System.out.println(user.getId());
            System.out.println(user.getAge());
            System.out.println(user.getName());
        }
        return ResponseUtil.ok(list);
    }
}
