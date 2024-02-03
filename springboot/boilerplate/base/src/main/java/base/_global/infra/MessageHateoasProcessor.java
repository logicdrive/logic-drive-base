package base._global.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

import base.domain.Base;

// REST 응답시에 추가적인 참조 URL들을 포함시키기 위해서
@Component
public class MessageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Base>> {

    @Override
    public EntityModel<Base> process(EntityModel<Base> model) {
        return model;
    }
}
