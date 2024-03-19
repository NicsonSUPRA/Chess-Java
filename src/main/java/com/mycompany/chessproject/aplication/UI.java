/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication;
import com.mycompany.chessproject.aplication.chess.ChessPiece;
/**
 *
 * @author nicsondev
 */
class UI {
    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print(" -");
        } else {
            System.out.print(piece);
        }
    }
    
    public static void printBoard(ChessPiece[][] pieces){
        for(int i=0; i<pieces.length; i++){
            System.out.print(8-i + " ");
            for(int j=0; j<pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.print("   a b c d e f g h");
    }
    

}
