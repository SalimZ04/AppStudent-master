package ma.io.AppStd.Resposity;
import ma.io.AppStd.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.io.AppStd.Resposity.StudentRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
