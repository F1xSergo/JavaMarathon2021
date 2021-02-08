package day17;

// Создайте Enum “Шахматная фигура” (англ. ChessPiece).
//Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook),
// слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
//В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
//Ценность фигуры - вещественное число
//Строковое обозначение фигуры
//
//В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны иметь
// следующий вид:
//KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
//
//У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPiece = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece piece : chessPiece) {
            System.out.print(piece.getDesignation() + " ");
        }
    }
}