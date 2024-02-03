package base.base.baseServiceTask;

import base._global.event.BaseCreated;

import base.base.reqDtos.CreateBaseReqDto;
import base.base.resDtos.CreateBaseResDto;

import base.domain.Base;
import base.domain.BaseRepository;

public class CreateBaseTask {
    public static CreateBaseResDto createBaseTask(CreateBaseReqDto createBaseReqDto, BaseRepository baseRepository) {
        Base savedBase = baseRepository.save(
            Base.builder()
                .base(createBaseReqDto.getBase())
                .build()
        );
        
        (new BaseCreated(savedBase)).publishAfterCommit();
    
        return new CreateBaseResDto(savedBase);
    }
}
