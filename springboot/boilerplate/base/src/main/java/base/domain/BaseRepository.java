package base.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bases", path = "bases")
public interface BaseRepository
    extends PagingAndSortingRepository<Base, Long> {}
