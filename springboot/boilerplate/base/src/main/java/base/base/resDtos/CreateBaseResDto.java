package base.base.resDtos;

import base.domain.Base;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CreateBaseResDto {
    private final Long id;

    public CreateBaseResDto(Base base) {
        this.id = base.getId();
    }
}
