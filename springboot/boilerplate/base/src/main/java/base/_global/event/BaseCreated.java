package base._global.event;

import base._global.infra.AbstractEvent;

import base.domain.Base;

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

    public BaseCreated() {
        super();
    }
}
