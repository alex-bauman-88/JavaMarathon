/*
Пешка (белая)  ♙   PAWN_WHITE
Конь (белый)   ♘   KNIGHT_WHITE
Слон (белый)   ♗   BISHOP_WHITE
Ладья (белая)  ♖   ROOK_WHITE
Ферзь (белый)  ♕   QUEEN_WHITE
Король (белый) ♔   KING_WHITE

Пешка (черная)  ♟   PAWN_BLACK
Конь (черный)   ♞   KNIGHT_BLACK
Слон (черный)   ♝   BISHOP_BLACK
Ладья (черная)  ♜   ROOK_BLACK
Ферзь (черный)  ♛   QUEEN_BLACK
Король (черный) ♚   KING_BLACK
 */
package day17;

public enum ChessPiece {
    PAWN_WHITE (1, "♙"), KNIGHT_WHITE(3, "♘"), BISHOP_WHITE(3.5, "♗"), ROOK_WHITE(5, "♖"),
    QUEEN_WHITE(9, "♕"), KING_WHITE(100, "♔"),
    PAWN_BLACK(1, "♟"), KNIGHT_BLACK(3, "♞"), BISHOP_BLACK(3.5, "♝"), ROOK_BLACK(5, "♜"),
    QUEEN_BLACK(9, "♛"), KING_BLACK(100, "♚"),
    EMPTY(-1, "_");

    private double value;
    private String icon;

    ChessPiece (double value, String icon){
        this.value = value;
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
