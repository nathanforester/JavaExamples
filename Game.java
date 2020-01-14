Public class Game {
Private Board board;
Private String userMove; 
Private User storeplayerOne;
Private int PlayerOnePasses;
Private int PlayerTwoPasses; 
Private User storeplayerTwo;
Private String gameID;
Private String Winner;
Private String Loser;  
Public Game (){
}
Public String placeStone (int x, int y) {
If (UserMove.equals(“P1”)){ 
return Board.placeStone(“P1”, x, y);
} else {
return Board.placeStone(“P2”, x, y);
}
}
Public String checkPasses (player1, Player2) {
If (PlayerOnePasses >= 3) {
Return “Player one reached 3 passes”;
}
If (PlayerTwoPasses >= 3) {
Return “Player two reached 3 passes”;
}
Public boolean selectPlayerOne (User P1){
This.storeplayerOne = P1;
}
Public Boolean selectPlayerTwo (User P2){
This.storeplayerTwo = P2;
}
Public User GetplayerOne  {
Return This.storePlayerOne;
}
Public User GetPlayerTwo{
Return This.storePlayerTwo;
}
Public String GetgameID () {
Return this.gameID;
}
Public void SetgameID(String GameID){
This.gameID == GameID;
}
Public String GetWinner(){
Return this.winner;
}
Public String GetLoser(){
Return this.loser;
}
Public void setWinner(String Winner){
This.Winner == Winner;
}
Public void setLoser(String Loser){
This.Loser == Loser;
}
