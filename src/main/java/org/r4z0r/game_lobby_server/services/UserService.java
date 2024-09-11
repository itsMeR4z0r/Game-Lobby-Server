package org.r4z0r.game_lobby_server.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.r4z0r.game_lobby_server.DAOs.AbstractDAO;
import org.r4z0r.game_lobby_server.DAOs.UserDAO;
import org.r4z0r.game_lobby_server.models.User;

import java.util.UUID;

@Stateless
public class UserService extends AbstractService<User, UUID> {
    @Inject
    private UserDAO userDAO;

    @Override
    protected AbstractDAO<User, UUID> getDAO() {
        return null;
    }
}
