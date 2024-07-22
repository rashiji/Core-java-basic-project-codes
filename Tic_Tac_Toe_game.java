package minigame;
import java.util.Scanner;
public class Tic_Tac_Toe_game {
        static char[][] board;


        public Tic_Tac_Toe_game () {
            board = new char[3][3];
            initboard();
        }

        void initboard() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = ' ';
                }
            }
        }

        static void disboard() {
            for (int i = 0; i < board.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                if (i < board.length - 1)
                    System.out.println("____+___+____");
            }
        }

        static void easy(int pos,char mark) {
            switch (pos) {
                case 1:
                    board[0][0] = mark;
                    break;
                case 2:
                    board[0][1] = mark;
                    break;
                case 3:
                    board[0][2] = mark;
                    break;
                case 4:
                    board[1][0] = mark;
                    break;
                case 5:
                    board[1][1] = mark;
                    break;
                case 6:
                    board[1][2] = mark;
                    break;
                case 7:
                    board[2][0] = mark;
                    break;
                case 8:
                    board[2][1] = mark;
                    break;
                case 9:
                    board[2][2] = mark;
                    break;
            }
        }

        static boolean colwin(){
            for(int j=0;j<=2;j++){
                if(board[0][j]!=' '&&board[0][j]==board[1][j]&&board[1][j]==board[2][j]){
                    return true;
                }
            }
            return false;
        }

        static boolean rowwin(){
            for(int i = 0; i <=2; i++){
                if(board[i][0]!=' '&&board[i][0]==board[i][1]&&board[i][1]==board[i][2]){
                    return true;
                }
            }
            return false;
        }

        static boolean dignoalwin(){
            if(board[0][0]!=' '&&board[0][0]==board[1][1]&&board[1][1]==board[2][2]
                    ||board[0][2]!=' '&&board[0][2]==board[1][1]&&board[1][1]==board[2][0]){

                return true;
            }
            return false;
        }

        static boolean gameover(){
            if(colwin()==true||rowwin()==true||dignoalwin()==true){
                return true;
            }
            return false;
        }

    }

    class humanplayer{
        Scanner s = new Scanner(System.in);
        String name;
        char mark;
        humanplayer(String name,char mark){
            this.name=name;
            this.mark=mark;
        }
        void move(){
            int pos;
            do {
                System.out.println("Enter a position from 1-9 ");
                pos = s.nextInt();
            } while (!isvalid(pos));
            Tic_Tac_Toe_game .easy(pos,mark);
        }
        boolean isvalid(int pos){
            if(pos>=0&&pos<=9) {
                for (int i = 0; i < Tic_Tac_Toe_game .board.length; i++) {
                    for (int j = 0; j < Tic_Tac_Toe_game .board[i].length; j++) {
                        if (Tic_Tac_Toe_game .board[i][j] == ' ') {
                            return true;
                        }
                    }
                }
            }
            return false;
        }


    }


    class lunchgame {
        public static void main(String[] args) {
            Tic_Tac_Toe_game  t = new Tic_Tac_Toe_game ();
            humanplayer p1=new humanplayer("player1",'x');
            humanplayer p2=new humanplayer("player2",'O');
            humanplayer crp;
            crp=p1; //referance type assignment

            while(true){
                System.out.println(crp.name+" make a move");
                crp.move();
                Tic_Tac_Toe_game .disboard();
                if(Tic_Tac_Toe_game .gameover()==true){
                    System.out.println(crp.name+" own");
                    break;
                }
                else{
                    if(crp==p1){
                        crp=p2;
                    }
                    else{
                        crp=p1;
                    }
                }
            }



        }
    }

