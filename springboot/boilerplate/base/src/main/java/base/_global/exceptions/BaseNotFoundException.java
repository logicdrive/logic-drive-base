package base._global.exceptions;

import org.springframework.http.HttpStatus;

import base._global.customExceptionControl.CustomException;
import lombok.Getter;

@Getter
public class BaseNotFoundException extends CustomException {
    public BaseNotFoundException() {
        super(
            HttpStatus.BAD_REQUEST,
            "BaseNotFoundException",
            "주어진 데이터와 매칭되는 Base를 발견하지 못했습니다."
        );
    }
}
