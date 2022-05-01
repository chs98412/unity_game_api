package game_pangpang.pangpang.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="level")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Level {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long levelId;

    @Column(name = "villain1")
    private Integer villain1;

    @Column(name = "villain2")
    private Integer villain2;
    @Column(name = "villain3")
    private Integer villain3;
    @Column(name = "villain4")
    private Integer villain4;
    @Column(name = "villain5")
    private Integer villain5;
    @Column(name = "villain6")
    private Integer villain6;
}