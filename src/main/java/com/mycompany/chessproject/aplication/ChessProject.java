/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chessproject.aplication;

import com.mycompany.chessproject.aplication.boardgame.Board;
import com.mycompany.chessproject.aplication.boardgame.Piece;
import com.mycompany.chessproject.aplication.boardgame.Position;
import com.mycompany.chessproject.aplication.chess.ChessPiece;
import com.mycompany.chessproject.aplication.chess.ChessMatch;
import com.mycompany.chessproject.aplication.chess.ChessPosition;
import java.lang.annotation.Target;
import java.util.Scanner;

/**
 *
 * @author nicsondev
 */
public class ChessProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println();
            System.out.print("Target:");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            
            
        }
        
        
    }
    
}
