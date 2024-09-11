package org.r4z0r.game_lobby_server.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.r4z0r.game_lobby_server.DAOs.AbstractDAO;
import org.r4z0r.game_lobby_server.DAOs.ChatDAO;
import org.r4z0r.game_lobby_server.models.Chat;

import java.util.UUID;

@Stateless
public class ChatService extends AbstractService<Chat, UUID> {
    @Inject
    private ChatDAO chatDAO;

    @Override
    protected AbstractDAO<Chat, UUID> getDAO() {
        return chatDAO;
    }
}
