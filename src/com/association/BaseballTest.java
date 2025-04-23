package com.association;

public class BaseballTest {

    public static void main(String[] args) {

        BaseballTeam team1 = new BaseballTeam("다이노스");
        BaseballTeam team2 = new BaseballTeam("롯데 자이언츠");
        BaseballPlayer player1 = new BaseballPlayer("이기영");

        // 팀 참여하다.
        player1.joinBaseballTeam(team1);

        // 팀 경기를 뛰다.
        player1.playGame();

        // 팀을 떠나다.
        player1.leaveTeam();

        // 팀 참여를 안하고 경기를 뛸려고 함
        player1.playGame();

        // 팀 참여한 상태로 다시 팀에 참여 할려고 함
        player1.joinBaseballTeam(team1);
        player1.joinBaseballTeam(team2);

        // 팀을 떠난 후 다시 떠날려고 함
        player1.leaveTeam();
        player1.leaveTeam();

    }
}
