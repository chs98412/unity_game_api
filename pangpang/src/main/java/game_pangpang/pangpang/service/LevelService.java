package game_pangpang.pangpang.service;

import game_pangpang.pangpang.entity.Level;
import game_pangpang.pangpang.repository.LevelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LevelService {
    private final LevelRepository levelRepository;

    @Transactional
    public Level find(Long Id){
        Optional<Level> result = levelRepository.findById(Id);
        return result.get();
    }


}