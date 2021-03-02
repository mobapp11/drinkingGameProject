package com.example.drinkinggame.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class PlayerCard implements Serializable {

    @NonNull
    @PrimaryKey(autoGenerate = false)
    private String playerId;
    private String playerName;

    public PlayerCard(@NonNull String playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    @NonNull
    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(@NonNull String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "PlayerCard{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
