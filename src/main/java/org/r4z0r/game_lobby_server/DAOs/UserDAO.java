package org.r4z0r.game_lobby_server.DAOs;

import org.r4z0r.game_lobby_server.models.User;

import java.util.UUID;

public class UserDAO extends AbstractDAO<User, UUID> {
    public UserDAO() {
        super(User.class);
    }
}
