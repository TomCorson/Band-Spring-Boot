package com.Band.Repo;

import com.Band.Model.Band;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface BandRepo extends CrudRepository<Band, Long> {


}
