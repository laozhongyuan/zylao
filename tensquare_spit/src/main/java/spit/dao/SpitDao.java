package spit.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import spit.pojo.Spit;


public interface SpitDao extends MongoRepository<Spit,String> {


  public Page<Spit> findByParentid(String parentid, Pageable pageable);
}
