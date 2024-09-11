package org.r4z0r.game_lobby_server.enums;

public enum Category {
    EMULATION("Emulation"), GAME("Game"), SOFTWARE("Software"), OTHER("Other");
    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
