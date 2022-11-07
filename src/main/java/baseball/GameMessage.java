package baseball;

public enum GameMessage {

    START_GAME("숫자 야구 게임을 시작합니다."),
    TRY_CORRECT("숫자를 입력해주세요 : "),
    END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RETRY_GAME("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    NOTING("낫싱"),
    BALL("볼 "),
    STRIKE("스트라이크");

    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}