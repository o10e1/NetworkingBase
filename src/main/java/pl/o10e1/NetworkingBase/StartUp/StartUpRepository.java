package pl.o10e1.NetworkingBase.StartUp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartUpRepository
        extends JpaRepository<StartUp, Long> {

}
