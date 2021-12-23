package com.example.restfulwebservice.user;

// HTTP Status code
// 2xx -> OK
// 4xx -> Client error
// 5xx -> Server error

/*사용자가 존재하지 않았을 때에 대한 데이터 값은 500 에러코드가 아닌,
        resource가 존재하지 않는 것이기 때문에 Not found 라는
        resource Status code 값을 전달*/

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
/*이 예외 클래스는 500번대 error가 아닌 NotFound(400번대) 오류로 클라이언트에게 전달되서
        클라이언트가 요청했던 데이터 값이 서버측에 오류중에서 데이터가 존재하지 않는 식의 오류입니다
        라고 알려줄 수 있도록*/
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
