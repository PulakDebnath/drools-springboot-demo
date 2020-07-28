package com.pd.exp.droolsdemo;

public class RequestMsg {

    public Member member;
    public String questnrName;
    public String questnrVerName;

    public String getQuestnrVerName() {
        return questnrVerName;
    }

    public void setQuestnrVerName(String questnrVerName) {
        this.questnrVerName = questnrVerName;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getQuestnrName() {
        return questnrName;
    }

    public void setQuestnrName(String questnrName) {
        this.questnrName = questnrName;
    }
}
