package game_pangpang.pangpang.service;


import game_pangpang.pangpang.dto.UserDto;
import game_pangpang.pangpang.entity.User;
import game_pangpang.pangpang.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    @Transactional
    public UserDto signup(UserDto userdto){
        User user=User.builder()
                .userId(userdto.getUserId())
                .username(userdto.getUsername())
                .coins(userdto.getCoins())
                .level(userdto.getCoins())
                .build();
        return UserDto.from(userRepository.save(user));
    }

    @Transactional
    public UserDto update(UserDto userdto){
        User user=User.builder()
                .userId(userdto.getUserId())
                .username(userdto.getUsername())
                .coins(userdto.getCoins())
                .level(userdto.getCoins())
                .build();
        return UserDto.from(userRepository.save(user));
    }
    @Transactional
    public List<UserDto> getusers(){
        List<User> l =userRepository.findAll();
        List<UserDto> dtolist = new ArrayList<UserDto>();
        for(User user : l){
            dtolist.add(UserDto.from(user));
        }
        return dtolist;
    }


}
