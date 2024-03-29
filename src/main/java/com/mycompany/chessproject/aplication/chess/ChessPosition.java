/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.chess;

import com.mycompany.chessproject.aplication.boardgame.Position;

/**
 *
 * @author nicsondev
 */
public class ChessPosition {
    private char column;
    private int row;
    
    public ChessPosition(char column, int row){
        this.column = column;
        this.row = row;
    }
    
    public char getColumn(){
        return column;
    }
    
    public int getRow(){
        return row;
    }
    
    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }
    
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }
    
    @Override
    public String toString(){
        return "" + column + row;
    }
}
