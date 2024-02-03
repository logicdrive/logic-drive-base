package base._global.event;

import base._global.infra.AbstractEvent;

import base.domain.Base;
import base.sanityCheck.reqDtos.MockBaseCreatedReqDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class BaseCreated extends AbstractEvent {
    private Long id;
    private String base;

    public BaseCreated(Base aggregate) {
        super(aggregate);
    }

    public BaseCreated(MockBaseCreatedReqDto mock) {
        super();
        this.id = mock.getId();
        this.base = mock.getBase();
    }

    public BaseCreated() {
        super();
    }
}
