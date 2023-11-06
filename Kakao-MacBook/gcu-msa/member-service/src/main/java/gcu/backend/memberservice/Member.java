package gcu.backend.memberservice;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Member {

    private Long id;
    private String name;
    private String password;


}