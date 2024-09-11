package org.r4z0r.game_lobby_server.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.r4z0r.game_lobby_server.DAOs.AbstractDAO;
import org.r4z0r.game_lobby_server.DAOs.FileDAO;
import org.r4z0r.game_lobby_server.models.File;

import java.util.UUID;

@Stateless
public class FileService extends AbstractService<File, UUID> {
    @Inject
    private FileDAO fileDAO;

    @Override
    protected AbstractDAO<File, UUID> getDAO() {
        return fileDAO;
    }
}
