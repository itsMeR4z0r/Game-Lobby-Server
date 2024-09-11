package org.r4z0r.game_lobby_server.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serial;
import java.util.Date;

@Entity
@Table(schema = "game_lobby", name = "default")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User extends AbstractModel {
    @Serial
    private static final long serialVersionUID = -7480604016140136221L;

    private String nickname;

    private String ipAddress;

    private String os;

    private Date lastLogin;
}
