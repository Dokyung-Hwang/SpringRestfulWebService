package com.example.restfulwebservice.helloworld;
// lombok - bean class를 만들 때 setter, getter, constructor, toString, equals와 같은 메소드를 자동으로 만들어줌

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
// property에 있는 모든 내용을 갖고 있는 생성자가 아닌 기본 생성자를 만들고자 한다면 NoArgsConstructor
// AllArgsConstructor - 모든 Argument를 갖고있는 생성자가 만들어짐
public class HelloWorldBean {
    private String message;

    /*public String getMessage(){
        return this.message;
    }

    public void setMessage(){
        this.message = message;
    }
    lombok을 사용하지 않으면 필드 생성 시 위의 경우 처럼
    생성자 메소드를 만들어줘야함.*/

    // AllArgsConstructor Annotation을 이용하면 아래 메소드를 생성하지 않아도 됌
    /*public HelloWorldBean(String message) {
        this.message = message;
    }*/
}
