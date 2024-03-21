/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.chess;

import com.mycompany.chessproject.aplication.boardgame.Board;
import com.mycompany.chessproject.aplication.boardgame.Position;
import com.mycompany.chessproject.aplication.pieces.King;
import com.mycompany.chessproject.aplication.pieces.Rock;

/**
 *
 * @author nicsondev
 */
public class ChessMatch {
    private Board board;
    
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i<board.getRows(); i++){
            for (int j = 0; j<board.getColumns(); j++){
                mat[i][j] =(ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void initialSetup(){
        placeNewPiece('e', 8, new King(board, Color.WHITE));
        placeNewPiece('b', 6, new Rock(board, Color.BLACK));
    }
}
