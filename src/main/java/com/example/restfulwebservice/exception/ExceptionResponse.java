package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// 다른 모든 컨트롤러에서 사용할 수 있는 일반화 되어있는 예외 클래스 선언

@Data
@AllArgsConstructor // 전체 모든 필드를 다 가지고 있는 생성자
@NoArgsConstructor  // 기본 생성자(매개 변수가 없는 생성자)
public class ExceptionResponse {
    private Date timestamp; // 예외가 발생한 시각
    private String message; // 예외가 발생한 메세지
    private String detail;  // 예외의 상세 정보
}
