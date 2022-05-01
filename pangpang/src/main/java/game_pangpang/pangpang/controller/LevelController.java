package game_pangpang.pangpang.controller;

import game_pangpang.pangpang.entity.Level;
import game_pangpang.pangpang.service.LevelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/level")
@RequiredArgsConstructor
public class LevelController {

    private final LevelService levelService;

    @GetMapping("/{level}")
    public Level levelInfo(@PathVariable Long level) {
               return levelService.find(level);
    }

}