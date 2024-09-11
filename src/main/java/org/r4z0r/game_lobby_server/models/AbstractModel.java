package org.r4z0r.game_lobby_server.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@MappedSuperclass
public abstract class AbstractModel implements Serializable {
    @Serial
    private static final long serialVersionUID = -5382519330740801877L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;


}
