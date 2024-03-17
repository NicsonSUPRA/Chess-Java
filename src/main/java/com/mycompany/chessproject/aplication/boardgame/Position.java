/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.boardgame;

/**
 *
 * @author nicsondev
 */
public class Position {
    private int row;
    private int column;
    
    public Position(int row, int column){
        this.column = column;
        this.row = row;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getColumn(){
        return column;
    }
    
    public void setRow(int row){
        this.row = row;
    }
    
    public void setColumn(int column){
        this.column = column;
    }
    
    @Override
    public String toString(){
        return row + " , " + column;
    }
    
}
