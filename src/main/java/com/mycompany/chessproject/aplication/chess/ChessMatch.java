/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.chess;

import com.mycompany.chessproject.aplication.boardgame.Board;
import com.mycompany.chessproject.aplication.boardgame.Piece;
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
    
    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPosition) capturedPiece;
    }
    
    private void validateSourcePosition(Position position){
        if (!board.thereIsAPiece(position)){
            throw new ChessException("There is no piece in this position");
        }
        
    }
    
    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void initialSetup(){
        placeNewPiece('e', 8, new King(board, Color.WHITE));
        placeNewPiece('b', 6, new Rock(board, Color.BLACK));
        
    }
}
