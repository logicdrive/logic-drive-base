package base.base;

import org.springframework.stereotype.Service;

import base.base.baseServiceTask.CreateBaseTask;
import base.base.reqDtos.CreateBaseReqDto;
import base.base.resDtos.CreateBaseResDto;
import base.domain.BaseRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BaseService {
    private final BaseRepository baseRepository;

    public CreateBaseResDto createBase(CreateBaseReqDto createBaseReqDto) {
        return CreateBaseTask.createBaseTask(createBaseReqDto, this.baseRepository);
    }
}