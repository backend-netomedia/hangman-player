package com.netomedia.exam.hangman.model;

public class ServerResponse {

    private String token;
    private String hangman;
    private Boolean correct;
    private Integer failedAttempts;

    private Boolean gameEnded;

    public ServerResponse() {

    }

    public ServerResponse(String token, String hangman, Boolean correct, Integer failedAttempts, Boolean gameEnded) {
        this.token = token;
        this.hangman = hangman;
        this.correct = correct;
        this.failedAttempts = failedAttempts;
        this.gameEnded = gameEnded;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getHangman() {
        return hangman;
    }

    public void setHangman(String hangman) {
        this.hangman = hangman;
    }

    public Boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Integer getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(Integer failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public Boolean getGameEnded() {
        return gameEnded;
    }

    @Override
    public String toString() {
        return "ServerResponse [token=" + token + ", hangman=" + hangman + ", correct=" + correct + ", failedAttempts=" + failedAttempts
                + ", gameEnded=" + gameEnded + "]";
    }
}
