/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication.boardgame;

/**
 *
 * @author nicsondev
 */
public class Piece {
    protected Position position;
    private Board board;
    
    public Piece(Board board){
        this.board = board;
        position = null;
    }
    
    protected Board getBoard(){
        return board;
    }
}
