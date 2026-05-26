package jordan.flashcard_app.Enum;

public enum FlashcardStatus {
    NEW("New"),
    REVIEWED("reviewed"),
    LEARNING("Learning");

    private final String displayName;

    FlashcardStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
