package org.r4z0r.game_lobby_server.DAOs;

import org.r4z0r.game_lobby_server.models.Chat;

import java.util.UUID;

public class ChatDAO extends AbstractDAO<Chat, UUID>{
    public ChatDAO() {
        super(Chat.class);
    }
}
