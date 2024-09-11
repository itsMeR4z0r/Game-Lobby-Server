package org.r4z0r.game_lobby_server.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Chat extends AbstractModel {
    @Serial
    private static final long serialVersionUID = 8313124150528880641L;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room;

    private String message;

    @ManyToOne
    @JoinColumn(name = "senderId")
    private User sender;

    private Date timestamp;
}
