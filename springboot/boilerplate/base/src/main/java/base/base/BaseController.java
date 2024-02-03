package base.base;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import base._global.logger.CustomLogger;
import base._global.logger.CustomLoggerType;
import base.base.reqDtos.CreateBaseReqDto;
import base.base.resDtos.CreateBaseResDto;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RestController
@Transactional
@RequiredArgsConstructor
@RequestMapping("/bases")
public class BaseController {
    private final BaseService baseService;

    @PutMapping("/createBase")
    public ResponseEntity<CreateBaseResDto> createBase(@RequestBody CreateBaseReqDto createBaseReqDto) {
        try {

            CustomLogger.debug(CustomLoggerType.ENTER, "", String.format("{%s: %s}", createBaseReqDto.getClass().getSimpleName(), createBaseReqDto.toString()));
        
            CreateBaseResDto createBaseResDto = this.baseService.createBase(createBaseReqDto);
        
            CustomLogger.debug(CustomLoggerType.EXIT, "", String.format("{%s: %s}", createBaseResDto.getClass().getSimpleName(), createBaseResDto.toString()));
            return ResponseEntity.ok(createBaseResDto);

        } catch(Exception e) {
            CustomLogger.error(e, "", String.format("{%s: %s}", createBaseReqDto.getClass().getSimpleName(), createBaseReqDto.toString()));
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
