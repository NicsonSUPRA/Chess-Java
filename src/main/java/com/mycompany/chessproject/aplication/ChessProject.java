/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chessproject.aplication;

import com.mycompany.chessproject.aplication.boardgame.Board;
import com.mycompany.chessproject.aplication.boardgame.Piece;
import com.mycompany.chessproject.aplication.boardgame.Position;
import com.mycompany.chessproject.aplication.chess.ChessPiece;
import com.mycompany.chessproject.aplication.chess.ChessMatch;

/**
 *
 * @author nicsondev
 */
public class ChessProject {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
