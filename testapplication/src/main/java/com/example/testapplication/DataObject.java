package com.example.testapplication;

/**
 * Created by USER on 2017-11-16.
 */

public class DataObject {
    private int ImagerId; // Img의 ID 변수

    //빈 생성자
    public DataObject(){
    }

    //전달받은 imagerId 를 멤버변수에 저장하는 생성자
    public DataObject(int imagerId) {
        this.ImagerId = imagerId;
    }

    // getter, setter 메소드

    public int getImagerId() {
        return ImagerId;
    }

    public void setImagerId(int imagerId) {
        this.ImagerId = imagerId;
    }
}
