package com.association;

public class BaseballPlayer {
    private String name;
    BaseballTeam baseballTeam;

    public BaseballPlayer(String name) {
        this.name = name;
        baseballTeam = null;
    }

    // 팀에 참여하다.
    public void joinBaseballTeam(BaseballTeam baseballTeam) {
        if(this.baseballTeam == null ) {
            this.baseballTeam = baseballTeam;
            System.out.println( this.name + " 이(가) " + this.baseballTeam.getTeamName() + " 팀에 참여 합니다" );
        } else {
            System.out.println("현재 " + this.name + " 선수는 팀에 참여한 상태입니다.");
        }
    }

    // 경기를 뛰다
    public void playGame() {
        if(this.baseballTeam != null ) {
            System.out.println(baseballTeam.getTeamName() +" 팀의 "+ this.name + " 이(가) 경기를 합니다" );
        } else {
            System.out.println("현재 " + this.name + " 선수는 팀이 없어 경기를 참여할 수 없습니다.");
        }

    }

    // 탈퇴하다
    public void leaveTeam() {
        if(this.baseballTeam != null ) {
            System.out.println(baseballTeam.getTeamName() +" 팀의 "+ this.name + " 선수가 팀을 떠납니다" );
            this.baseballTeam = null;
        } else {
            System.out.println("현재 " + this.name + " 선수는 이미 팀을 떠난 상태입니다.");
        }
    }


}
