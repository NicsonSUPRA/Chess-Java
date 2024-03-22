/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessproject.aplication;
import com.mycompany.chessproject.aplication.chess.ChessPiece;
import com.mycompany.chessproject.aplication.chess.ChessPosition;
import com.mycompany.chessproject.aplication.chess.Color;
import java.util.Scanner;
/**
 *
 * @author nicsondev
 */
class UI {
    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print(" - ");
        } else {
            if (piece.getColor() == Color.BLACK){
                System.out.print(piece + "p");
            } else {
                System.out.print(piece + "b");
            }
            //System.out.print(piece);
        }
    }
    
    public static ChessPosition readChessPosition(Scanner sc){
        String s = sc.nextLine();
        char column = s.charAt(0);
        int row = Character.getNumericValue(s.charAt(1));
        return new ChessPosition(column, row);
        
    }
    
    public static void printBoard(ChessPiece[][] pieces){
        for(int i=0; i<pieces.length; i++){
            System.out.print(8-i + " ");
            for(int j=0; j<pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.print("   a  b  c  d  e  f  g  h");
    }
    

}
