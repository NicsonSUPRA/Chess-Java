/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.chess;
import com.mycompany.chessproject.aplication.boardgame.Board;
import com.mycompany.chessproject.aplication.boardgame.Piece;
/**
 *
 * @author nicsondev
 */
public class ChessPiece extends Piece {
    private Color color;
    
    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
}
