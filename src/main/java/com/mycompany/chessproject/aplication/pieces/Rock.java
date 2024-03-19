/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.pieces;
import com.mycompany.chessproject.aplication.boardgame.Board;
import com.mycompany.chessproject.aplication.chess.ChessPiece;
import com.mycompany.chessproject.aplication.chess.Color;
/**
 *
 * @author nicsondev
 */
public class Rock extends ChessPiece{
    
    public Rock(Board board, Color color) {
        super(board, color);
    }
    
    
    @Override
    public String toString(){
        return " R";
    }
}
