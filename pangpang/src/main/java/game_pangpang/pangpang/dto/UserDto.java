package game_pangpang.pangpang.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import game_pangpang.pangpang.entity.User;
import lombok.*;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long userId;

    @NotNull
    private String username;

    @NotNull
    private Integer coins;

    @NotNull
    private Integer level;


    public static UserDto from(User user) {
        if(user == null) return null;

        return UserDto.builder()
                .userId(user.getUserId())
                .username(user.getUsername())
                .coins(user.getCoins())
                .level(user.getLevel())
                .build();
    }
}