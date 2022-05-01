package game_pangpang.pangpang.controller;


import game_pangpang.pangpang.dto.UserDto;
import game_pangpang.pangpang.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public UserDto signup(@RequestBody UserDto userDto) {
        return userService.signup(userDto);
    }

    @PostMapping("/update")
    public UserDto update(@RequestBody UserDto userDto) {
        return userService.signup(userDto);
    }

    @GetMapping("/users")
    public List<UserDto> getMyUserInfo(HttpServletRequest request) {

        return userService.getusers();
    }

}