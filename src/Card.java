class Card {
    private String suit;
    private String color;
    private String value;

    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", suit, color, value);
    }
}