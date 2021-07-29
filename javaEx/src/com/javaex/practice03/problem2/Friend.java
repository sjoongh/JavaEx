package com.javaex.practice03.problem2;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    //필요한 메소드 작성
    public Friend(String name, String hp, String school) {
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    public String getname() {
    	return name;
    }
    public String gethp() {
    	return hp;
    }
    public String getschool() {
    	return school;
    }
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
