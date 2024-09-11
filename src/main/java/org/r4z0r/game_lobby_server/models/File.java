package org.r4z0r.game_lobby_server.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serial;

@Entity
@Table(schema = "game_lobby", name = "default")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class File extends AbstractModel {
    @Serial
    private static final long serialVersionUID = -1565501386196378760L;

    private String extension;
    private String fileName;
    private byte[] data;
}
