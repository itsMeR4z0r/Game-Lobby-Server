package org.r4z0r.game_lobby_server.DAOs;

import org.r4z0r.game_lobby_server.models.File;

import java.util.UUID;

public class FileDAO extends AbstractDAO<File, UUID> {
    public FileDAO() {
        super(File.class);
    }
}
