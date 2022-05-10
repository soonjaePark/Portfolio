package sjpark.porfolio.portfolio.entities.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sjpark.porfolio.portfolio.entities.MyInfoEntity;

public interface MyInfoRepo extends JpaRepository<MyInfoEntity, Long> {
    
}
