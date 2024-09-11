package org.r4z0r.game_lobby_server.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.r4z0r.game_lobby_server.DAOs.AbstractDAO;
import org.r4z0r.game_lobby_server.DAOs.RoomDAO;
import org.r4z0r.game_lobby_server.models.Room;

import java.util.UUID;

@Stateless
public class RoomService extends AbstractService<Room, UUID> {
    @Inject
    private RoomDAO roomDAO;

    @Override
    protected AbstractDAO<Room, UUID> getDAO() {
        return roomDAO;
    }
}
