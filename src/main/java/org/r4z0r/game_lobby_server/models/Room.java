package org.r4z0r.game_lobby_server.models;

import jakarta.persistence.*;
import lombok.*;
import org.r4z0r.game_lobby_server.enums.Category;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "game_lobby", name = "default")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Room extends AbstractModel {
    @Serial
    private static final long serialVersionUID = 5626723422753757052L;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String description;
    private String password;

    @OneToMany
    private List<User> users = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "ownerId")
    private User owner;

    private int maxUsers;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @ManyToOne(optional = true)
    @JoinColumn(name = "nameId")
    private File file;

    private String chatCryptKey;
}
