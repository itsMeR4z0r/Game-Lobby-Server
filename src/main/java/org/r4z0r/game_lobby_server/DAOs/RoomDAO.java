package org.r4z0r.game_lobby_server.DAOs;

import org.r4z0r.game_lobby_server.models.Room;

import java.util.UUID;

public class RoomDAO extends AbstractDAO<Room, UUID>{
    public RoomDAO() {
        super(Room.class);
    }
}
